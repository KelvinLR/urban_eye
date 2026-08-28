package com.example.urbaneye.feature.places.presentation.home
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.urbaneye.core.designsystem.component.PlaceCard
import com.example.urbaneye.core.designsystem.component.PlaceGenreSelector
import androidx.compose.runtime.*
import com.example.urbaneye.core.designsystem.component.PlaceGenreSelectorSlider
import com.example.urbaneye.core.designsystem.component.UrbanEyeSearchBar
import com.example.urbaneye.core.designsystem.component.UrbanEyeTopAppBar

val LABELS = listOf("Alimentação", "Museus", "Cultura", "Natureza")

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = { UrbanEyeTopAppBar() }
    ) {
        paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFFFFFFF))
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Greetings()
            UrbanEyeSearchBar()
            PlaceGenreSelectorSlider(LABELS)
            PlaceListView()
        }
    }
}

@Composable
fun Greetings() {
    Text(text = "Bem-vindo!", fontSize = 22.sp, fontWeight = FontWeight(600))
    Text("Para onde vamos hoje?")
}

@Composable
fun PlaceListView() {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(24.dp),
    ) {
        items(3) {
            PlaceCard()
        }
    }
}

