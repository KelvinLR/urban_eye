package com.example.urbaneye.feature.places.presentation.home
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
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
            active = false,
            onActiveChange = { },
            placeholder = { Text("Onde vamos hoje?") }
        ) { }

        PlaceCard(
            path = "Oi"
        )
        PlaceCard(
            path = "Oi"
        )
        PlaceCard(
            path = "Oi"
        )
    }

}
