package com.example.gym4jim.componentsTests

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.gym4jim.ui.components.MotivationQuote
import org.junit.Rule
import org.junit.Test

class MotivationQuoteTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun motivationQuote_displaysQuoteAndAuthor() {
        val quote = "Push yourself because no one else is going to do it for you"
        val author = "Unknown"

        composeTestRule.setContent {
            MotivationQuote(quote = quote, author = author)
        }

        composeTestRule.onNodeWithText("\"$quote\"").assertIsDisplayed()
        composeTestRule.onNodeWithText("~$author").assertIsDisplayed()
    }
}
