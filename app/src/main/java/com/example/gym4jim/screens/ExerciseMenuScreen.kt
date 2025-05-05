package com.example.gym4jim.ui.screens

import ExerciseViewModel
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gym4jim.R
import com.example.gym4jim.classes.Exercise
import com.example.gym4jim.ui.components.JimsMessage
import com.example.gym4jim.ui.theme.Gym4JimTheme

@Composable
fun ExerciseMenuScreen(
    exerciseViewModel: ExerciseViewModel,
    onExerciseSelected: (Exercise) -> Unit
) {
    val exercises = exerciseViewModel.getExercisesFromCurrentCategory();

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        JimsMessage(message = "No BS. Just gains. Show them how it’s done.")

        Spacer(modifier = Modifier.height(16.dp))

        ExerciseMenu(
            exercises = exercises,
            onExerciseClick = onExerciseSelected
        )
    }
}

/*
@Preview(showBackground = true)
@Composable
fun ExerciseMenuScreenPreview() {
    Gym4JimTheme {
        ExerciseMenuScreen(
            onExerciseClick = { /* Preview – no action */ }
        )
    }
}
*/