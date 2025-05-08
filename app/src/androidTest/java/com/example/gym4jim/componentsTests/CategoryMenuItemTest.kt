package com.example.gym4jim.componentsTests

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FitnessCenter
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.gym4jim.ui.components.CategoryMenuItem
import org.junit.Rule
import org.junit.Test

class CategoryMenuItemTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun categoryMenuItem_displaysTextAndIcon() {
        composeTestRule.setContent {
            CategoryMenuItem(
                text = "Nogi",
                icon = Icons.Filled.FitnessCenter,
                onClick = {}
            )
        }

        composeTestRule.onNodeWithText("Nogi").assertIsDisplayed()
    }

    @Test
    fun categoryMenuItem_triggersOnClick() {
        var wasClicked = false

        composeTestRule.setContent {
            CategoryMenuItem(
                text = "Plecy",
                icon = Icons.Filled.FitnessCenter,
                onClick = { wasClicked = true }
            )
        }

        composeTestRule.onNodeWithText("Plecy").performClick()
        assert(wasClicked)
    }
}
