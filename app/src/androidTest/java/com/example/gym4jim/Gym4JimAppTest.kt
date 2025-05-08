package com.example.gym4jim

import ExerciseViewModel
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

class Gym4JimAppTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun gym4JimApp_navigatesToMotivationScreen() {
        val viewModel = ExerciseViewModel()
        viewModel.loadExercisesAndCategories()

        val motivationCategory = viewModel.getCategories().find { it.name == "Motivation" }
        requireNotNull(motivationCategory) { "Motivation category not found" }

        composeTestRule.setContent {
            Gym4JimApp(exerciseViewModel = viewModel)
        }

        composeTestRule.onNodeWithText(motivationCategory.name).performClick()

        composeTestRule.onNodeWithText("Video of the Day").assertExists()
        composeTestRule.onNodeWithText("Quote of the Day").assertExists()
        composeTestRule.onNodeWithText("Audio of the Day").assertExists()
    }

    @Test
    fun gym4JimApp_navigatesToExerciseScreenFromMenu() {
        val viewModel = ExerciseViewModel()
        viewModel.loadExercisesAndCategories()
        val nonMotivationCategory = viewModel.getCategories().find { it.name != "Motivation" }!!
        viewModel.onCategoryChosen(nonMotivationCategory)

        val exercise = viewModel.getExercisesFromCurrentCategory().first()

        composeTestRule.setContent {
            Gym4JimApp(exerciseViewModel = viewModel)
        }

        composeTestRule.onNodeWithText(nonMotivationCategory.name).performClick()

        composeTestRule.waitUntil(timeoutMillis = 5000) {
            composeTestRule.onAllNodesWithText(exercise.name).fetchSemanticsNodes().isNotEmpty()
        }
        composeTestRule.onNodeWithText(exercise.name).performClick()

        composeTestRule.onNodeWithText(exercise.name).assertExists()
        composeTestRule.onNodeWithText("How to - ${exercise.name}").assertExists()
    }
}
