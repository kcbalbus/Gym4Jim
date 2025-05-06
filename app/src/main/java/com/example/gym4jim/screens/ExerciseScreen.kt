package com.example.gym4jim.ui.screens

import ExerciseViewModel
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.gym4jim.ui.components.*

@Composable
fun ExerciseScreen(
    exerciseViewModel: ExerciseViewModel,
    modifier: Modifier = Modifier
) {
    val exercise = exerciseViewModel.getCurrentExercise();

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        ExerciseHeader(title = exercise.name)

        PhotoCarousel(imageResIds = exercise.image_files)

        Spacer(modifier = Modifier.height(8.dp))

        ExerciseDescription(description = exercise.description)

        Spacer(modifier = Modifier.height(16.dp))

        ExerciseVideoPlayer(videoResId = exercise.video_file)

        Spacer(modifier = Modifier.height(16.dp))

        SubsectionHeader(title = "How to - ${exercise.name}")
        ExerciseDescription(description = exercise.execution)

        Spacer(modifier = Modifier.height(16.dp))

        JimsMessage(message = exercise.jims_tip)
    }
}
