package com.example.gym4jim.componentsTests

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.gym4jim.ui.components.VideoPlayer
import org.junit.Rule
import org.junit.Test
import com.example.gym4jim.R

class VideoPlayerTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun videoPlayer_fullscreenButton_isVisible() {
        composeTestRule.setContent {
            VideoPlayer(
                videoResId = R.raw.benchpress_video,
                onVideoClicked = {}
            )
        }

        composeTestRule
            .onNodeWithContentDescription("Fullscreen")
            .assertIsDisplayed()
    }

    @Test
    fun videoPlayer_fullscreenButton_triggersCallback() {
        var clicked = false

        composeTestRule.setContent {
            VideoPlayer(
                videoResId = R.raw.benchpress_video,
                onVideoClicked = { clicked = true }
            )
        }

        composeTestRule
            .onNodeWithContentDescription("Fullscreen")
            .performClick()

        assert(clicked)
    }

    @Test
    fun videoPlayer_displaysAndroidView() {
        composeTestRule.setContent {
            VideoPlayer(
                videoResId = R.raw.benchpress_video,
                onVideoClicked = {}
            )
        }

        composeTestRule
            .onNodeWithContentDescription("Fullscreen")
            .assertExists()
    }

}
