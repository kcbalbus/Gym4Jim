package com.example.gym4jim.componentsTests

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.example.gym4jim.ui.components.SubsectionHeader
import org.junit.Rule
import org.junit.Test

class SubsectionHeaderTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun subsectionHeader_displaysTitleCorrectly() {
        val titleText = "Ćwiczenia na klatkę piersiową"

        composeTestRule.setContent {
            SubsectionHeader(title = titleText)
        }

        composeTestRule
            .onNodeWithText(titleText, substring = false)
            .assertIsDisplayed()
    }
}
