package com.example.gym4jim.classesTests

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FitnessCenter
import com.example.gym4jim.classes.Category
import org.junit.Assert
import org.junit.Test

class CategoryTest {

    @Test
    fun testCategoryCreation() {
        val icon =  Icons.Filled.FitnessCenter
        val category = Category(name = "Strength", icon = icon)


        Assert.assertEquals("Strength", category.name)
        Assert.assertEquals(icon, category.icon)
    }
}
