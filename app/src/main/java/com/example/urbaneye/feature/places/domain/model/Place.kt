package com.example.urbaneye.feature.places.domain.model

class Place(
    val id: String,
    val name: String,
    val type: String,
    val latitude: Double,
    val longitude: Double,
    val address: String,
    val rating: Double,
    val imageUrl: String
) {

}
