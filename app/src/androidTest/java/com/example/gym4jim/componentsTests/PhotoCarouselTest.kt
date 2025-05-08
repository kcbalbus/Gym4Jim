package com.example.gym4jim.componentsTests

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.unit.dp
import com.example.gym4jim.R
import com.example.gym4jim.ui.components.PhotoCarousel
import org.junit.Rule
import org.junit.Test

class PhotoCarouselTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun photoCarousel_displaysClickableImageBox() {
        val images = listOf(
            R.drawable.benchpress_photo,
            R.drawable.deadlift_photo
        )

        composeTestRule.setContent {
            PhotoCarousel(
                imageResIds = images,
                onPhotoClicked = {}
            )
        }

        composeTestRule.onAllNodes(
            hasClickAction(),
            useUnmergedTree = true
        ).onFirst().assertExists()
    }


    @Test
    fun photoCarousel_triggersClickOnImage() {
        val images = listOf(
            R.drawable.benchpress_photo,
            R.drawable.deadlift_photo
        )
        var clickedImage: Int? = null

        composeTestRule.setContent {
            PhotoCarousel(
                imageResIds = images,
                onPhotoClicked = { clickedImage = it }
            )
        }

        composeTestRule.onNode(hasClickAction()).performClick()
        assert(clickedImage == R.drawable.benchpress_photo)
    }

    @Test
    fun photoCarousel_swipeLeft_changesPage() {
        val images = listOf(
            R.drawable.benchpress_photo,
            R.drawable.deadlift_photo,
            R.drawable.squat_photo
        )

        composeTestRule.setContent {
            PhotoCarousel(
                imageResIds = images,
                onPhotoClicked = {}
            )
        }

        val pager = composeTestRule
            .onAllNodes(hasClickAction(), useUnmergedTree = true)[0]

        pager.performTouchInput { swipeLeft() }

        val selectedIndicators = composeTestRule
            .onAllNodes(hasTestTag("indicator_selected"), useUnmergedTree = true)

        selectedIndicators.assertCountEquals(1)

        val unselectedIndicators = composeTestRule
            .onAllNodes(hasTestTag("indicator_unselected"), useUnmergedTree = true)

        unselectedIndicators.assertCountEquals(images.size - 1)
    }


}
