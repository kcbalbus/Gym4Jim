package com.example.gym4jim.screensTests

import ExerciseViewModel
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.tooling.preview.Preview
import com.example.gym4jim.ui.screens.FullScreenVideoScreen
import org.junit.Rule
import org.junit.Test

class FullScreenVideoScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    private fun setupViewModelWithVideo(): ExerciseViewModel {
        val viewModel = ExerciseViewModel()
        viewModel.loadExercisesAndCategories()
        viewModel.onCategoryChosen(viewModel.getCategories().first())
        viewModel.onExerciseChosen(viewModel.getExercisesFromCurrentCategory().first())
        viewModel.onVideoChosen(viewModel.getCurrentExercise().video_file)
        return viewModel
    }

    @Test
    fun fullScreenVideoScreen_rendersWithoutCrashing() {
        val viewModel = setupViewModelWithVideo()

        composeTestRule.setContent {
            FullScreenVideoScreen(exerciseViewModel = viewModel)
        }

        composeTestRule.onRoot().assertExists()
    }

    @Test
    fun fullScreenVideoScreen_displaysExoPlayerView() {
        val viewModel = setupViewModelWithVideo()

        composeTestRule.setContent {
            FullScreenVideoScreen(exerciseViewModel = viewModel)
        }

        composeTestRule
            .onNodeWithTag("VideoPlayerView", useUnmergedTree = true)
            .assertExists()
    }

    @Test
    fun fullScreenVideoScreen_reactsToVideoClick() {
        val viewModel = setupViewModelWithVideo()

        composeTestRule.setContent {
            FullScreenVideoScreen(exerciseViewModel = viewModel)
        }

        composeTestRule.onNodeWithTag("VideoPlayerView")
            .performClick()

        composeTestRule.onNodeWithTag("VideoPlayerView", useUnmergedTree = true)
            .assertExists()
    }

}
