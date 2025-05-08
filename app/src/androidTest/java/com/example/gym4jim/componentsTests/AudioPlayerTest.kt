package com.example.gym4jim.componentsTests

import com.example.gym4jim.ui.components.AudioPlayer

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.gym4jim.MainActivity
import com.example.gym4jim.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.compose.ui.test.junit4.createComposeRule

@RunWith(AndroidJUnit4::class)
class AudioPlayerTest {

    @get:Rule
    val composeTestRule = createComposeRule()


    @Test
    fun audioPlayer_displaysPlayButtonInitially() {
        composeTestRule.setContent {
            AudioPlayer(audioResId = R.raw.motivational_audio)
        }
        composeTestRule.onNodeWithContentDescription("Play").assertIsDisplayed()
    }

    @Test
    fun audioPlayer_togglesPlayPause() {
        composeTestRule.setContent {
            AudioPlayer(audioResId = R.raw.motivational_audio)
        }
        composeTestRule.onNodeWithContentDescription("Play").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithContentDescription("Pause").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Pause").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithContentDescription("Play").assertIsDisplayed()
    }

    @Test
    fun audioPlayer_displaysTimeText() {
        composeTestRule.setContent {
            AudioPlayer(audioResId = R.raw.motivational_audio)
        }
        composeTestRule.onNodeWithText("01:25").assertExists()
    }
}
