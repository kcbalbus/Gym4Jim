package com.example.gym4jim.componentsTests

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.gym4jim.ui.components.ExerciseDescription
import org.junit.Rule
import org.junit.Test

class ExerciseDescriptionTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun exerciseDescription_displaysText() {
        val testText = "To ćwiczenie rozwija mięśnie klatki piersiowej i tricepsów."

        composeTestRule.setContent {
            ExerciseDescription(description = testText)
        }

        composeTestRule.onNodeWithText(testText).assertIsDisplayed()
    }
}
