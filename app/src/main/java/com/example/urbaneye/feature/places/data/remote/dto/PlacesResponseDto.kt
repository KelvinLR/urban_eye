package com.example.urbaneye.feature.places.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class PlacesResponseDto(
    val places: List<PlaceDto>? = null
)

@Serializable
data class PlaceDto(
    val id: String? = null,
    val displayName: DisplayNameDto? = null,
    val formattedAddress: String? = null,
    val primaryType: String? = null,
    val rating: Double? = null,
    val location: LocationDto? = null
)

@Serializable
data class DisplayNameDto(
    val text: String? = null
)

@Serializable
data class LocationDto(
    val latitude: Double? = null,
    val longitude: Double? = null
)
