package com.example.urbaneye.core.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UrbanEyeSearchBar() {
    SearchBar (
        query = "",
        onQueryChange = { },
        onSearch = { },
        leadingIcon = {
            Icon(
                imageVector = Icons.Filled.Search,
                contentDescription = "Search"
            )
        },
        active = false,
        onActiveChange = { },
        placeholder = { Text("Onde vamos hoje?") }
    ) {
        Modifier.size(
            width = 358.dp,
            height = 192f.dp,
        ).background(Color(0xFFBFCABA))
    }
}
