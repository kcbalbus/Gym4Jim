package com.example.gym4jim.states

import allCategories
import allExercises
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Category
import androidx.compose.material.icons.filled.FitnessCenter
import com.example.gym4jim.classes.Category
import com.example.gym4jim.classes.Exercise

data class ExerciseState(
    val categories: List<Category> = emptyList(),
    val exercises: List<Exercise> = emptyList(),
    val currentCategory: Category = Category("", Icons.Filled.Category),
    val currentExercise: Exercise = Exercise("", "", emptyList(), 0, "", "", "", ""),
    val currentPhoto: Int = 0,
    val currentVideo: Int = 0

)