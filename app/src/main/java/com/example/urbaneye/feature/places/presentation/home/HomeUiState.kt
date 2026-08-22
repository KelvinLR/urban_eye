package com.example.urbaneye.feature.places.presentation.home

import com.example.urbaneye.feature.places.domain.model.Place

data class HomeUiState(
    val isLoading: Boolean = false,
    val places: List<Place> = emptyList(),
    val errorMessage: String? = null
)
