package com.example.urbaneye.core.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun PlaceCard() {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp
    val screenHeight = configuration.screenHeightDp

    Box(
        Modifier
            .size(
                width = ((358f / 390f) * screenWidth).dp,
                height = ((318f / 844f) * screenHeight).dp,
            )
            .background(Color.White)
            .clip(RoundedCornerShape(10.dp))
            .border(1.dp, Color(0xFFBFCABA), androidx.compose.foundation.shape.RoundedCornerShape(10.dp))
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            PlaceImage()
            Details()

        }
    }
}

@Composable
fun PlaceImage() {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp
    val screenHeight = configuration.screenHeightDp

    Box(
        modifier = Modifier
            .size(
                width = ((358f / 390f) * screenWidth).dp,
                height = ((192f / 844f) * screenHeight).dp,
            )
            .background(Color(0xFFBFCABA)),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Filled.Place,
            contentDescription = "Place"
        )
    }
}

@Composable
fun Details() {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp
    val screenHeight = configuration.screenHeightDp

    Column(
        Modifier.padding(
            start = ((16f / 390f) * screenWidth).dp,
            end = ((16f / 390f) * screenWidth).dp,
            top = ((16f / 844f) * screenHeight).dp,
        ),
        verticalArrangement = Arrangement.SpaceBetween,

        ) {
        Text(text = "Title", color = Color(0xFF1C1B1F), fontWeight = FontWeight(500))
        Text(text = "Address", color = Color(0xFF40493D), fontWeight = FontWeight(300))
        Row(
            Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Genre",
                color = Color(0xFF0D631B),
                fontWeight = FontWeight(400),
                modifier = Modifier
                    .background(
                        color = Color(0xFF88D982).copy(alpha = 0.5f),
                        shape = RoundedCornerShape(4.dp)
                    )
                    .padding(vertical = 4.dp, horizontal = 8.dp)

            )
            TextButton(onClick = { }) {
                Text(text = "Detalhes", color = Color(0xFF0D631B))
            }
        }
    }
}
