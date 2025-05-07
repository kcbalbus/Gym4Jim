package com.example.gym4jim.ui.screens

import ExerciseViewModel
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gym4jim.classes.Category
import com.example.gym4jim.ui.components.JimsMessage
import com.example.gym4jim.ui.theme.Gym4JimTheme

@Composable
fun CategoryMenuScreen(
    exerciseViewModel: ExerciseViewModel,
    onCategorySelected: (Category) -> Unit
) {
    val categories = exerciseViewModel.getCategories();

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize(),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        JimsMessage(message = "Make yourself comfortable bro. Choose whatever you feel like doing!")

        Spacer(modifier = Modifier.height(24.dp))

        CategoryMenu(
            categories = categories,
            onCategorySelected = onCategorySelected
        )
    }
}

/*
@Preview(showBackground = true)
@Composable
fun CategoryMenuScreenPreview() {
    Gym4JimTheme {
        CategoryMenuScreen(onCategorySelected = {})
    }
}
*/