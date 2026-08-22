package com.example.urbaneye.feature.places.domain.repository
import com.example.urbaneye.feature.places.domain.model.Place
import com.example.urbaneye.core.common.result.Result

interface PlacesRepository {
    // suspend define q uma func é assíncrona
    suspend fun getNearbyPlaces(latitude: Double, longitude: Double, radius: Int): Result<List<Place>>
    suspend fun getPlaceDetails(placeId: String): Result<Place>
}


