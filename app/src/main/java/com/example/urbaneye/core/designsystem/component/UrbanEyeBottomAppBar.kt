package com.example.urbaneye.core.designsystem.component

import android.R
import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun UrbanEyeBottomAppBar() {
    NavigationBar {
        UrbanEyeNavigationItem(
            icon = { Icon(imageVector = Icons.Filled.Home, contentDescription = "Home") },
            label = { Text("Home") },
            isSelected = true,
            onClick = {}
        )
        UrbanEyeNavigationItem(
            icon = { Icon(imageVector = Icons.Filled.Search, contentDescription = "Buscar") },
            label = { Text("Buscar") },
            isSelected = false,
            onClick = {}
        )
        UrbanEyeNavigationItem(
            icon = { Icon(imageVector = Icons.Filled.FavoriteBorder, contentDescription = "Favoritos") },
            label = { Text("Favoritos") },
            isSelected = false,
            onClick = {}
        )
    }
}

@Composable
fun RowScope.UrbanEyeNavigationItem(
    icon: @Composable () -> Unit,
    label: @Composable () -> Unit,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    NavigationBarItem(
        icon = icon,
        selected = isSelected,
        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = Color(0xFFFFFFFF),
            selectedTextColor = Color(0xFF0D631B),
            indicatorColor = Color(0xFF0D631B)
        ),
        onClick = onClick,
        label = label
    )
}
