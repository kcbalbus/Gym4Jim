package com.example.gym4jim

import androidx.annotation.StringRes
import com.example.gym4jim.R

enum class AppScreens(
    val route: String,
    @StringRes val titleRes: Int
) {
    CategoryMenu("category_menu", R.string.category_menu_title),
    ExerciseMenu("exercise_menu", R.string.exercise_menu_title),
    Exercise("exercise", R.string.exercise_title),
    Motivation("motivation", R.string.motivation_title),
    FullScreenPhoto("photo", R.string.full_screen_photo_title),
    FullScreenVideo("video", R.string.full_screen_video_title);
}
