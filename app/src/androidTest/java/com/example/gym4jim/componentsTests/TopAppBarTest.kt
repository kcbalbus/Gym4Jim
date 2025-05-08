package com.example.gym4jim

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performClick
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test

class Gym4JimAppBarTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun appBar_displaysBackButton_whenCanNavigateBackIsTrue() {
        composeTestRule.setContent {
            Gym4JimAppBar(
                canNavigateBack = true,
                navigateUp = {}
            )
        }

        val backContentDescription = InstrumentationRegistry
            .getInstrumentation()
            .targetContext
            .getString(R.string.back_button)

        composeTestRule
            .onNodeWithContentDescription(backContentDescription)
            .assertIsDisplayed()
    }

    @Test
    fun appBar_backButtonCallsNavigateUp_whenClicked() {
        var wasClicked = false

        composeTestRule.setContent {
            Gym4JimAppBar(
                canNavigateBack = true,
                navigateUp = { wasClicked = true }
            )
        }

        val backContentDescription = InstrumentationRegistry
            .getInstrumentation()
            .targetContext
            .getString(R.string.back_button)

        composeTestRule
            .onNodeWithContentDescription(backContentDescription)
            .performClick()

        assertTrue(wasClicked)
    }

    @Test
    fun appBar_doesNotDisplayBackButton_whenCanNavigateBackIsFalse() {
        composeTestRule.setContent {
            Gym4JimAppBar(
                canNavigateBack = false,
                navigateUp = {}
            )
        }

        val backContentDescription = InstrumentationRegistry
            .getInstrumentation()
            .targetContext
            .getString(R.string.back_button)

        composeTestRule
            .onNodeWithContentDescription(backContentDescription)
            .assertDoesNotExist()
    }
}
