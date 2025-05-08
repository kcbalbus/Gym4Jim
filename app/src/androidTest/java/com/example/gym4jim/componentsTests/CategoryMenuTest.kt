package com.example.gym4jim.screensTests

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.gym4jim.classes.Category
import com.example.gym4jim.ui.screens.CategoryMenu
import org.junit.Rule
import org.junit.Test

class CategoryMenuTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    private val sampleCategories = listOf(
        Category("Klatka piersiowa", Icons.Default.Star),
        Category("Plecy", Icons.Default.Star),
        Category("Nogi", Icons.Default.Star),
    )

    @Test
    fun categoryMenu_displaysAllCategoryNames() {
        composeTestRule.setContent {
            CategoryMenu(categories = sampleCategories, onCategorySelected = {})
        }

        sampleCategories.forEach {
            composeTestRule.onNodeWithText(it.name).assertIsDisplayed()
        }
    }

    @Test
    fun categoryMenu_triggersCallbackOnClick() {
        var selectedCategory: Category? = null

        composeTestRule.setContent {
            CategoryMenu(
                categories = sampleCategories,
                onCategorySelected = { selectedCategory = it }
            )
        }

        val targetCategory = sampleCategories[1]
        composeTestRule.onNodeWithText(targetCategory.name).performClick()

        assert(selectedCategory == targetCategory)
    }
}
