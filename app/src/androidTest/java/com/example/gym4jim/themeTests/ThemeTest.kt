package com.example.gym4jim.themeTests

import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.gym4jim.ui.theme.DarkGray
import com.example.gym4jim.ui.theme.Gym4JimTheme
import com.example.gym4jim.ui.theme.LightGray
import com.example.gym4jim.ui.theme.RobotoMedium
import com.example.gym4jim.ui.theme.White
import org.junit.Rule
import org.junit.Test

class ThemeTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun theme_appliesCorrectPrimaryColor() {
        composeTestRule.setContent {
            Gym4JimTheme {
                assert(MaterialTheme.colorScheme.primary == DarkGray)
            }
        }
    }

    @Test
    fun theme_appliesCorrectSecondaryColor() {
        composeTestRule.setContent {
            Gym4JimTheme {
                assert(MaterialTheme.colorScheme.secondary == LightGray)
            }
        }
    }

    @Test
    fun theme_appliesCorrectBackgroundColor() {
        composeTestRule.setContent {
            Gym4JimTheme {
                assert(MaterialTheme.colorScheme.background == White)
            }
        }
    }

    @Test
    fun theme_appliesCorrectOnPrimaryColor() {
        composeTestRule.setContent {
            Gym4JimTheme {
                assert(MaterialTheme.colorScheme.onPrimary == White)
            }
        }
    }

    @Test
    fun theme_appliesCorrectFontFamily() {
        composeTestRule.setContent {
            Gym4JimTheme {
                assert(MaterialTheme.typography.displayLarge.fontFamily == RobotoMedium)
            }
        }
    }

    @Test
    fun theme_appliesCorrectFontWeightForDisplayLarge() {
        composeTestRule.setContent {
            Gym4JimTheme {
                assert(MaterialTheme.typography.displayLarge.fontWeight == FontWeight.Companion.Medium)
            }
        }
    }

    @Test
    fun theme_appliesCorrectFontSizeForDisplayLarge() {
        composeTestRule.setContent {
            Gym4JimTheme {
                assert(MaterialTheme.typography.displayLarge.fontSize == 36.sp)
            }
        }
    }

    @Test
    fun theme_appliesCorrectBodySmallFontSize() {
        composeTestRule.setContent {
            Gym4JimTheme {
                assert(MaterialTheme.typography.bodySmall.fontSize == 17.sp)
            }
        }
    }
}