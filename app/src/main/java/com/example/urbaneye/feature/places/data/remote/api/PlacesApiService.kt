package com.example.urbaneye.feature.places.data.remote.api

import com.example.urbaneye.BuildConfig
import kotlinx.serialization.json.JsonObject
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface PlacesApiService {
    @POST("v1/places:searchNearby")
    suspend fun searchNearby(
        @Header("X-Goog-Api-Key") apiKey: String = BuildConfig.PLACES_API_KEY,
        @Header("X-Goog-FieldMask") fieldMask: String = "places.id,places.displayName",
        @Body requestBody: JsonObject
    ): JsonObject
}
