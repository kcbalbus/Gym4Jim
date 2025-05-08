package com.example.gym4jim.screensTests

import ExerciseViewModel
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.gym4jim.ui.screens.ExerciseScreen
import org.junit.Rule
import org.junit.Test

class ExerciseScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    private fun setupScreen(): ExerciseViewModel {
        val viewModel = ExerciseViewModel()
        viewModel.loadExercisesAndCategories()
        viewModel.onCategoryChosen(viewModel.getCategories().first())
        viewModel.onExerciseChosen(viewModel.getExercisesFromCurrentCategory().first())
        return viewModel
    }

    @Test
    fun exerciseScreen_displaysExerciseNameInHeader() {
        val viewModel = setupScreen()
        val exercise = viewModel.getCurrentExercise()

        composeTestRule.setContent {
            ExerciseScreen(
                exerciseViewModel = viewModel,
                onPhotoClicked = {},
                onVideoClicked = {}
            )
        }

        composeTestRule.onNodeWithText(exercise.name).assertExists()
    }

    @Test
    fun exerciseScreen_displaysExerciseDescription() {
        val viewModel = setupScreen()
        val exercise = viewModel.getCurrentExercise()

        composeTestRule.setContent {
            ExerciseScreen(
                exerciseViewModel = viewModel,
                onPhotoClicked = {},
                onVideoClicked = {}
            )
        }

        composeTestRule.onNodeWithText(exercise.description).assertExists()
    }

    @Test
    fun exerciseScreen_displaysExecutionText() {
        val viewModel = setupScreen()
        val exercise = viewModel.getCurrentExercise()

        composeTestRule.setContent {
            ExerciseScreen(
                exerciseViewModel = viewModel,
                onPhotoClicked = {},
                onVideoClicked = {}
            )
        }

        composeTestRule.onNodeWithText("How to - ${exercise.name}").assertExists()
        composeTestRule.onNodeWithText(exercise.execution).assertExists()
    }

    @Test
    fun exerciseScreen_displaysJimsTipMessage() {
        val viewModel = setupScreen()
        val exercise = viewModel.getCurrentExercise()

        composeTestRule.setContent {
            ExerciseScreen(
                exerciseViewModel = viewModel,
                onPhotoClicked = {},
                onVideoClicked = {}
            )
        }

        composeTestRule.onNodeWithText(exercise.jims_tip).assertExists()
    }
}
