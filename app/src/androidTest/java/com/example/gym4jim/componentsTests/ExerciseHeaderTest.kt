package com.example.gym4jim.componentsTests

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.gym4jim.ui.components.ExerciseHeader
import org.junit.Rule
import org.junit.Test

class ExerciseHeaderTest {

    @get:Rule
    val composeTestRule = createComposeRule()


    @Test
    fun exerciseHeader_hasCorrectText() {
        val testTitle = "Martwy ciąg"

        composeTestRule.setContent {
            ExerciseHeader(title = testTitle)
        }

        composeTestRule
            .onNodeWithText(testTitle)
            .assert(hasText(testTitle))
    }
}
