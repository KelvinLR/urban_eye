package com.example.urbaneye.feature.places.presentation.home
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.urbaneye.feature.places.presentation.components.PlaceCard


@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFFFFFFF))
                .padding(16.dp)
    ) {
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color(0xFFFFFFFF),
                titleContentColor = Color(0xFF0D631B),
            ),
            title = {
                Text(
                    text = "UrbanEye",
                    fontSize = 22.sp,
                    fontWeight = FontWeight(800)
                )
            }
        )

        Text(text = "Bem-vindo!", fontSize = 22.sp, fontWeight = FontWeight(500))
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
        ) {
            items(3) {
                PlaceCard(
                    path = "Oi"
                )
            }
        }
    }

}
