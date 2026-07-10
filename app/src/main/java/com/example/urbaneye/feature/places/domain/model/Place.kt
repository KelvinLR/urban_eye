package com.example.urbaneye.feature.places.domain.model

data class Place(
    val id: String,
    val name: String,
    val type: String,
    val address: String,
    val latitude: Double,
    val longitude: Double,
    val description: String?,
    val rating: Double?,
    val photoUrl: String?,
    val contactPhone: String?,
    val isOpenNow: Boolean?
)
