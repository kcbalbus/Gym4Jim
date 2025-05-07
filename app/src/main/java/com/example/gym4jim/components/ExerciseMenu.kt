package com.example.gym4jim.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gym4jim.ui.components.ExerciseItemCard
import com.example.gym4jim.R
import com.example.gym4jim.classes.Exercise


@Composable
fun ExerciseMenu(
    exercises: List<Exercise>,
    onExerciseClick: (Exercise) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        exercises.chunked(2).forEach { rowItems ->
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                rowItems.forEach { exercise ->
                    ExerciseItemCard(
                        name = exercise.name,
                        imageResId = exercise.image_files[0],
                        onClick = { onExerciseClick(exercise) },
                        modifier = Modifier
                            .weight(1f)
                    )
                }

                if (rowItems.size < 2) {
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}

/*
@Preview(showBackground = true)
@Composable
fun ExerciseMenuPreview() {
    val sampleExercises = listOf(
        Exercise("Bench Press", R.drawable.benchpress_photo),
        Exercise("Deadlift", R.drawable.deadlift_photo),
        Exercise("Squat", R.drawable.squat_photo),
        Exercise("Leg Press", R.drawable.legpress_photo)
    )

    com.example.gym4jim.ui.theme.Gym4JimTheme {
        ExerciseMenu(
            exercises = sampleExercises,
            onExerciseClick = {}
        )
    }
}
*/
