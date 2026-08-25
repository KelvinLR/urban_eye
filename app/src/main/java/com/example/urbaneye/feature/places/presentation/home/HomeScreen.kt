package com.example.urbaneye.feature.places.presentation.home
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.urbaneye.feature.places.presentation.components.PlaceCard


@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TopAppBar(
            title = { Text(text = "UrbanEye") }

        )

        Text(text = "Bem-vindo!")
        Text("Para onde vamos hoje?")

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

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(24.dp),
            contentPadding = PaddingValues(all = 16.dp)
        ) {
            items(3) {
                PlaceCard(
                    path = "Oi"
                )
            }
        }
    }

}
