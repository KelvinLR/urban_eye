package com.example.urbaneye.feature.places.domain.usecase

import com.example.urbaneye.core.common.result.Result
import com.example.urbaneye.feature.places.domain.model.Place
import com.example.urbaneye.feature.places.domain.repository.PlacesRepository
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class GetNearbyPlacesUseCaseTest {

    // Cria um repositório "falso" (mock) para não precisar da internet
    private lateinit var repository: PlacesRepository
    private lateinit var useCase: GetNearbyPlacesUseCase

    @BeforeEach
    fun setup() {
        repository = mockk()
        useCase = GetNearbyPlacesUseCase(repository)
    }

    @Test
    fun `deve retornar erro quando o raio for menor ou igual a zero`() = runTest {
        // GIVEN: um raio inválido
        val radius = -1

        // WHEN: executo o use case
        val result = useCase(latitude = -23.5, longitude = -46.6, radius = radius)

        // THEN: deve retornar um Result.Error
        assertTrue(result is Result.Error)
    }

    @Test
    fun `deve retornar lista de lugares quando a busca for bem sucedida`() = runTest {
        // GIVEN: o repositório vai retornar uma lista fake
        val fakePlaces = listOf(
            Place(
                id = "1",
                name = "Café Central",
                type = "cafe",
                address = "Rua A, 100",
                latitude = -23.5,
                longitude = -46.6,
                description = null,
                rating = 4.5,
                photoUrl = null,
                contactPhone = null,
                isOpenNow = true
            )
        )
        coEvery { repository.getNearbyPlaces(any(), any(), any()) } returns Result.Success(fakePlaces)

        // WHEN: executo o use case
        val result = useCase(latitude = -23.5, longitude = -46.6, radius = 1000)

        // THEN: deve retornar Success com a lista
        assertTrue(result is Result.Success)
        assertEquals(1, (result as Result.Success).data.size)
        assertEquals("Café Central", result.data[0].name)
    }
}
