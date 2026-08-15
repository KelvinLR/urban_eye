package com.example.urbaneye.feature.places.domain.usecase

import com.example.urbaneye.core.common.result.Result
import com.example.urbaneye.feature.places.domain.model.Place
import com.example.urbaneye.feature.places.domain.repository.PlacesRepository
import javax.inject.Inject

class GetNearbyPlacesUseCase @Inject constructor(
    private val repository: PlacesRepository
) {
    suspend operator fun invoke(
        latitude: Double,
        longitude: Double,
        radius: Int = 1000
    ): Result<List<Place>> {

        if (radius <= 0) {
            return Result.Error(IllegalArgumentException("O raio de busca deve ser maior que zero"))
        }

        return repository.getNearbyPlaces(latitude, longitude, radius)
    }
}
