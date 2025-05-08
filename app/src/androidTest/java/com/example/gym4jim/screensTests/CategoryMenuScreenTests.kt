package com.example.gym4jim.screensTests

import ExerciseViewModel
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.gym4jim.ui.screens.CategoryMenuScreen
import org.junit.Rule
import org.junit.Test

class CategoryMenuScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun categoryMenuScreen_displaysJimMessage() {
        val viewModel = ExerciseViewModel()

        composeTestRule.setContent {
            CategoryMenuScreen(
                exerciseViewModel = viewModel,
                onCategorySelected = {}
            )
        }

        composeTestRule
            .onNodeWithText("Make yourself comfortable bro. Choose whatever you feel like doing!")
            .assertExists()
    }

    @Test
    fun categoryMenuScreen_displaysAllCategories() {
        val viewModel = ExerciseViewModel()
        val expectedCategories = viewModel.getCategories()

        composeTestRule.setContent {
            CategoryMenuScreen(
                exerciseViewModel = viewModel,
                onCategorySelected = {}
            )
        }

        expectedCategories.forEach { category ->
            composeTestRule.onNodeWithText(category.name).assertExists()
        }
    }
}
