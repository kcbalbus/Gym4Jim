package com.example.gym4jim.screensTests

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.gym4jim.R
import com.example.gym4jim.classes.Exercise
import com.example.gym4jim.ui.screens.ExerciseMenu
import org.junit.Rule
import org.junit.Test

class ExerciseMenuTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun exerciseMenu_displaysAllExerciseNames() {
        val exercises = listOf(
            Exercise(
                id = "1",
                name = "Bench Press",
                image_files = listOf(R.drawable.benchpress_photo),
                video_file = R.raw.benchpress_video,
                description = "Description of Bench Press",
                execution = "Execution details of Bench Press",
                jims_tip = "Tip for Bench Press",
                category = "Chest"
            ),
            Exercise(
                id = "2",
                name = "Deadlift",
                image_files = listOf(R.drawable.deadlift_photo),
                video_file = R.raw.deadlift_video,
                description = "Description of Deadlift",
                execution = "Execution details of Deadlift",
                jims_tip = "Tip for Deadlift",
                category = "Back"
            ),
            Exercise(
                id = "3",
                name = "Squat",
                image_files = listOf(R.drawable.squat_photo),
                video_file = R.raw.squat_video,
                description = "Description of Squat",
                execution = "Execution details of Squat",
                jims_tip = "Tip for Squat",
                category = "Legs"
            )
        )

        composeTestRule.setContent {
            ExerciseMenu(exercises = exercises, onExerciseClick = {})
        }

        exercises.forEach {
            composeTestRule.onNodeWithText(it.name).assertIsDisplayed()
        }
    }

    @Test
    fun exerciseMenu_triggersOnExerciseClick() {
        var clickedExerciseName = ""

        val exercises = listOf(
            Exercise(
                id = "1",
                name = "Bench Press",
                image_files = listOf(R.drawable.benchpress_photo),
                video_file = R.raw.benchpress_video,
                description = "Description of Bench Press",
                execution = "Execution details of Bench Press",
                jims_tip = "Tip for Bench Press",
                category = "Chest"
            ),
            Exercise(
                id = "2",
                name = "Deadlift",
                image_files = listOf(R.drawable.deadlift_photo),
                video_file = R.raw.deadlift_video,
                description = "Description of Deadlift",
                execution = "Execution details of Deadlift",
                jims_tip = "Tip for Deadlift",
                category = "Back"
            )
        )

        composeTestRule.setContent {
            ExerciseMenu(
                exercises = exercises,
                onExerciseClick = { clickedExerciseName = it.name }
            )
        }

        composeTestRule.onNodeWithText("Deadlift").performClick()
        assert(clickedExerciseName == "Deadlift")
    }
}
