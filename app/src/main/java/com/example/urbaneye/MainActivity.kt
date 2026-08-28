package com.example.urbaneye

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.urbaneye.core.designsystem.theme.UrbanEyeTheme
import com.example.urbaneye.feature.places.presentation.home.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UrbanEyeTheme {
                HomeScreen()
            }
        }
    }
}
