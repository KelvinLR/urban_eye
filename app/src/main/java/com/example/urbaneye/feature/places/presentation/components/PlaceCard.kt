package com.example.urbaneye.feature.places.presentation.components

import android.R
import android.widget.ImageView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp

@Composable
fun PlaceCard(path: String) {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp
    val screenHeight = configuration.screenHeightDp

    Box {
        Modifier.size(
            width = ((100f / 390f) * screenWidth).dp,
            height = ((100f / 390f) * screenWidth).dp,
        ).background(Color.Red)
        Column() {
            Box(
                modifier = Modifier.size(
                    width = ((100f / 390f) * screenWidth).dp,
                    height = ((100f / 390f) * screenWidth).dp,
                ).background(Color.Red),

            ) {
                Modifier.size(
                    width = ((100f / 390f) * screenWidth).dp,
                    height = ((100f / 390f) * screenWidth).dp,
                )
            }
            Text(text = "Title")
            Text(text = "Address")
            Row() {
                Text(text = "Genre")
                TextButton(onClick = { }) {
                    Text(text = "More")
                }
            }

        }
    }
}
