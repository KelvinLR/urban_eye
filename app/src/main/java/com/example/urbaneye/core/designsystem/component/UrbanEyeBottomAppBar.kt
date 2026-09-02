package com.example.urbaneye.core.designsystem.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun UrbanEyeBottomAppBar() {
    NavigationBar {
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Filled.Home, contentDescription = "Home") },
            selected = true,
            onClick = {},
            label = {
                Text("Home")
            }
        )
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Filled.Search, contentDescription = "Buscar") },
            selected = false,
            onClick = {},
            label = {
                Text("Buscar")
            }
        )
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Favoritos") },
            selected = false,
            onClick = {},
            label = {
                Text("Favoritos")
            }
        )
        /*IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Filled.Home, contentDescription = "Home")
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Filled.Search, contentDescription = "Search")
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Search")
        }*/
    }


}
