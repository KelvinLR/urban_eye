package com.example.urbaneye.feature.places.domain.model

class Place(
    val id: String,
    val name: String,
    val type: String,
    val latitude: Double,
    val longitude: Double,
) {

    override fun toString(): String {
        return super.toString()
    }
}
