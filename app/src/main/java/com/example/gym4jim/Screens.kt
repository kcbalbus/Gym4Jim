package com.example.gym4jim

import androidx.annotation.StringRes
import com.example.gym4jim.R

enum class AppScreens(
    val route: String,
    @StringRes val titleRes: Int
) {
    CategoryMenu("category_menu", R.string.category_menu_title),
    ExerciseMenu("exercise_menu", R.string.exercise_menu_title);
}
