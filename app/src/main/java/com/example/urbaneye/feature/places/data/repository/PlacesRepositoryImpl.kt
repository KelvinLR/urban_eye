package com.example.urbaneye.feature.places.data.repository

import com.example.urbaneye.core.common.result.Result
import com.example.urbaneye.feature.places.data.remote.api.PlacesApiService
import com.example.urbaneye.feature.places.domain.model.Place
import com.example.urbaneye.feature.places.domain.repository.PlacesRepository
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonArray
import kotlinx.serialization.json.putJsonObject
import javax.inject.Inject

// O @Inject diz ao Hilt: "Eu preciso do PlacesApiService para funcionar, entregue ele pra mim!"
class PlacesRepositoryImpl @Inject constructor(
    private val apiService: PlacesApiService
) : PlacesRepository {

    override suspend fun getNearbyPlaces(
        latitude: Double,
        longitude: Double,
        radius: Int
    ): Result<List<Place>> {
        return try {
            // 1. MONTAR O PEDIDO
            // Usamos as variáveis latitude, longitude e radius passadas pela tela!
            val request = buildJsonObject {
                putJsonArray("includedTypes") { add(kotlinx.serialization.json.JsonPrimitive("restaurant")) } // Por enquanto buscando restaurantes!
                put("maxResultCount", 10)
                putJsonObject("locationRestriction") {
                    putJsonObject("circle") {
                        putJsonObject("center") {
                            put("latitude", latitude)
                            put("longitude", longitude)
                        }
                        put("radius", radius.toDouble())
                    }
                }
            }

            // 2. CHAMAR A API
            val response = apiService.searchNearby(requestBody = request)

            // 3. O MAPEAMENTO (A GRANDE MÁGICA)
            // Aqui pegamos a lista de "PlaceDto" e transformamos na lista de "Place" puro do seu app
            val places = response.places?.map { dto ->
                Place(
                    id = dto.id ?: "",
                    name = dto.displayName?.text ?: "Lugar Desconhecido", // Se não vier nome, usamos um padrão
                    type = dto.primaryType ?: "Desconhecido",
                    address = dto.formattedAddress ?: "Sem endereço",
                    latitude = dto.location?.latitude ?: 0.0,
                    longitude = dto.location?.longitude ?: 0.0,
                    description = dto.editorialSummary?.text, // Lembra que a gente pediu isso?
                    rating = dto.rating,
                    photoUrl = null, // Deixamos nulo por enquanto até configurarmos as fotos
                    contactPhone = null,
                    isOpenNow = null
                )
            } ?: emptyList() // Se a API não retornar nada, devolvemos uma lista vazia

            // 4. RETORNAR SUCESSO
            Result.Success(places)

        } catch (e: Exception) {
            // Se der erro de internet ou no servidor, retornamos Result.Error
            Result.Error(e)
        }
    }

    override suspend fun getPlaceDetails(placeId: String): Result<Place> {
        return Result.Error(NotImplementedError("Faremos no futuro!"))
    }
}
