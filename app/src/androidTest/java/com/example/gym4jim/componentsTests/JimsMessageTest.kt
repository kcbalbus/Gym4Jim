package com.example.gym4jim.componentsTests

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.gym4jim.R
import com.example.gym4jim.ui.components.JimsMessage
import org.junit.Rule
import org.junit.Test

class JimsMessageTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun jimsMessage_displaysMessageText() {
        val testMessage = "Nie zapomnij napić się wody między seriami!"

        composeTestRule.setContent {
            JimsMessage(message = testMessage)
        }

        composeTestRule.onNodeWithText(testMessage).assertIsDisplayed()
    }

    @Test
    fun jimsMessage_displaysImageWithCorrectDescription() {
        composeTestRule.setContent {
            JimsMessage(message = "Pamiętaj o rozgrzewce!")
        }

        composeTestRule.onNodeWithContentDescription("Jim").assertIsDisplayed()
    }
}
