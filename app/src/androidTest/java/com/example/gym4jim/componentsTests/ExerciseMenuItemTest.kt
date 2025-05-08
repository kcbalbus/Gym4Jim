package com.example.gym4jim.componentsTests

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.gym4jim.R
import com.example.gym4jim.ui.components.ExerciseItemCard
import org.junit.Rule
import org.junit.Test

class ExerciseItemCardTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun exerciseItemCard_displaysNameAndImage() {
        composeTestRule.setContent {
            ExerciseItemCard(
                name = "Bench Press",
                imageResId = R.drawable.benchpress_photo,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )
        }

        composeTestRule.onNodeWithText("Bench Press").assertIsDisplayed()

        composeTestRule.onNodeWithContentDescription("Bench Press").assertIsDisplayed()
    }

    @Test
    fun exerciseItemCard_triggersOnClick() {
        var wasClicked = false

        composeTestRule.setContent {
            ExerciseItemCard(
                name = "Deadlift",
                imageResId = R.drawable.deadlift_photo,
                onClick = { wasClicked = true },
                modifier = Modifier.fillMaxWidth()
            )
        }

        composeTestRule.onNodeWithText("Deadlift").performClick()
        assert(wasClicked)
    }
}
