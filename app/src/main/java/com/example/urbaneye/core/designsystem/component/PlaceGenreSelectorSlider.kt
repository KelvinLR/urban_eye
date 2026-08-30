package com.example.urbaneye.core.designsystem.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PlaceGenreSelectorSlider(labels: List<String>) {
    var selectedIndex by remember { mutableStateOf(labels.firstOrNull() ?: "") }

    LazyRow(
        modifier = Modifier.padding(vertical = 24.dp),
        horizontalArrangement = Arrangement.spacedBy(12.5.dp)
    ) {
        items(labels) { label ->
            PlaceGenreSelector(
                label = label,
                isSelected = (label == selectedIndex),
                onClick = { selectedIndex = label }
            )
        }
    }
}


