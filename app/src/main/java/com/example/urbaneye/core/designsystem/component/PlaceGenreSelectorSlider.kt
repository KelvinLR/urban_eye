package com.example.urbaneye.core.designsystem.component

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun PlaceGenreSelectorSlider() {
    LazyRow() { }
}

@Composable
fun PlaceGenreSelector(label: String, isSelected: Boolean) {
    val backgroudColor = if (isSelected) Color(0xFF0D631B) else Color(0xFFBFCABA)
    val textColor = if (isSelected) Color(0xFFFFFFFF) else Color(0xFF000000)
    val borderColor = if (isSelected) Color(0xFF0D631B) else Color(0xFFBFCABA)

    FilterChip(selected = isSelected, onClick = { !isSelected }, label = { Text(label) })
}
