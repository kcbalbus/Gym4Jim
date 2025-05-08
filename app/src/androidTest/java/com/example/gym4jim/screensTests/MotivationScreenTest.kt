package com.example.gym4jim.screensTests

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.gym4jim.ui.screens.MotivationScreen
import org.junit.Rule
import org.junit.Test

class MotivationScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun motivationScreen_displaysMessage() {
        composeTestRule.setContent {
            MotivationScreen(
                onVideoClicked = {}
            )
        }

        composeTestRule.onNodeWithText("Hit the gym - meet buddies get baddies.")
            .assertExists()
    }

    @Test
    fun motivationScreen_displaysVideoOfTheDaySection() {
        composeTestRule.setContent {
            MotivationScreen(
                onVideoClicked = {}
            )
        }

        composeTestRule.onNodeWithText("Video of the Day")
            .assertExists()

    }

    @Test
    fun motivationScreen_displaysQuoteOfTheDay() {
        composeTestRule.setContent {
            MotivationScreen(
                onVideoClicked = {}
            )
        }

        composeTestRule.onNodeWithText("Quote of the Day")
            .assertExists()

    }

    @Test
    fun motivationScreen_displaysAudioOfTheDaySection() {
        composeTestRule.setContent {
            MotivationScreen(
                onVideoClicked = {}
            )
        }

        composeTestRule.onNodeWithText("Audio of the Day")
            .assertExists()

    }

}
