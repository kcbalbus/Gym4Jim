package com.example.gym4jim.screensTests

import ExerciseViewModel
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.gym4jim.ui.screens.FullScreenImageScreen
import org.junit.Rule
import org.junit.Test

class FullScreenImageScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    private fun setupViewModelWithPhoto(): ExerciseViewModel {
        val viewModel = ExerciseViewModel()
        viewModel.loadExercisesAndCategories()
        viewModel.onCategoryChosen(viewModel.getCategories().first())
        viewModel.onExerciseChosen(viewModel.getExercisesFromCurrentCategory().first())
        viewModel.onPhotoChosen(viewModel.getCurrentExercise().image_files.first())
        return viewModel
    }

    @Test
    fun fullScreenImageScreen_displaysImageFromViewModel() {
        val viewModel = setupViewModelWithPhoto()
        val expectedPhotoId = viewModel.getCurrentPhoto()

        composeTestRule.setContent {
            FullScreenImageScreen(exerciseViewModel = viewModel)
        }

        composeTestRule
            .onNodeWithTag("FullScreenImage", useUnmergedTree = true)
            .assertExists()
    }
}
