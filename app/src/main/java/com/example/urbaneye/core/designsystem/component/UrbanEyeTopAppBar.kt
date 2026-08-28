package com.example.urbaneye.core.designsystem.component

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UrbanEyeTopAppBar() {
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
}
