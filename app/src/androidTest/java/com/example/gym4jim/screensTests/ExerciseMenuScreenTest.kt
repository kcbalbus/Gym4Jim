package com.example.gym4jim.screensTests

import ExerciseViewModel
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.gym4jim.ui.screens.ExerciseMenuScreen
import org.junit.Rule
import org.junit.Test

class ExerciseMenuScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun exerciseMenuScreen_displaysJimsMessage() {
        val viewModel = ExerciseViewModel()
        viewModel.loadExercisesAndCategories()
        viewModel.onCategoryChosen(viewModel.getCategories().first())

        composeTestRule.setContent {
            ExerciseMenuScreen(
                exerciseViewModel = viewModel,
                onExerciseSelected = {}
            )
        }

        composeTestRule
            .onNodeWithText("No BS. Just gains. Show them how it’s done.")
            .assertExists()
    }

    @Test
    fun exerciseMenuScreen_displaysExercisesForCurrentCategory() {
        val viewModel = ExerciseViewModel()
        viewModel.loadExercisesAndCategories()
        val category = viewModel.getCategories().first()
        viewModel.onCategoryChosen(category)

        val expectedExercises = viewModel.getExercisesFromCurrentCategory()

        composeTestRule.setContent {
            ExerciseMenuScreen(
                exerciseViewModel = viewModel,
                onExerciseSelected = {}
            )
        }

        expectedExercises.forEach { exercise ->
            composeTestRule.onNodeWithText(exercise.name).assertExists()
        }
    }
}
