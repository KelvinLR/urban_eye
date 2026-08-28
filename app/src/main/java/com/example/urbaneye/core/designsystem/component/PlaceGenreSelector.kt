package com.example.urbaneye.core.designsystem.component

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun PlaceGenreSelector(
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    ) {
        FilterChip(
            colors = FilterChipDefaults.filterChipColors(
                containerColor = Color(0xFFE5E1E7),
                labelColor = Color(0xFF40493D),

                selectedContainerColor = Color(0xFF2E7D32),
                selectedLabelColor = Color(0xFFCBFFC2),
            ),
            shape = CircleShape,
            border = null,
            selected = isSelected,
            onClick = onClick,
            label = { Text(label) }

        )
}
