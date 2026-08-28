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
import androidx.compose.ui.unit.dp

@Composable
fun PlaceCard() {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp
    val screenHeight = configuration.screenHeightDp

    Box(
        Modifier.Companion
            .size(
                width = ((358f / 390f) * screenWidth).dp,
                height = ((297f / 844f) * screenHeight).dp,
            )
            .background(Color.Companion.White)
            .clip(RoundedCornerShape(10.dp))
            .border(1.dp, Color(0xFFBFCABA), androidx.compose.foundation.shape.RoundedCornerShape(10.dp))
    ) {
        Column(
        ) {
            Box(
                modifier = Modifier.Companion.size(
                    width = ((358f / 390f) * screenWidth).dp,
                    height = ((192f / 844f) * screenHeight).dp,
                ).background(Color(0xFFBFCABA)),
                contentAlignment = Alignment.Companion.Center
            ) {
                Icon(
                    imageVector = Icons.Filled.Place,
                    contentDescription = "Place"
                )
            }
            Column(
                Modifier.Companion.padding(
                    start = 16.dp,
                    end = 16.dp,
                    top = 16.dp,
                )
            ) {
                Text(text = "Title")
                Text(text = "Address")
                Row(
                    Modifier.Companion.fillMaxWidth(),
                    verticalAlignment = Alignment.Companion.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Genre")
                    TextButton(onClick = { }) {
                        Text(text = "Detalhes")
                    }
                }

            }

        }
    }
}
