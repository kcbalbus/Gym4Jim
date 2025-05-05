package com.example.gym4jim.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gym4jim.classes.Category
import com.example.gym4jim.ui.components.MenuItemCard
import com.example.gym4jim.ui.theme.Gym4JimTheme


@Composable
fun CategoryMenu(
    categories: List<Category>,
    onCategorySelected: (Category) -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        categories.forEach { category ->
            MenuItemCard(
                text = category.name,
                icon = category.icon,
                onClick = { onCategorySelected(category) }
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CategoryMenuPreview() {
    Gym4JimTheme {
        CategoryMenu(listOf(
            Category("Klatka piersiowa", Icons.Default.Star),
            Category("Plecy", Icons.Default.Star),
            Category("Nogi", Icons.Default.Star),
        ),
            onCategorySelected = {})
    }
}