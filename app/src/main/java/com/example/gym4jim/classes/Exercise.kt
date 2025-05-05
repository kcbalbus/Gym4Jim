package com.example.gym4jim.classes

data class Exercise(
    val id: String,
    val name: String,
    val image_files: List<Int>,
    val video_file: String,
    val description: String,
    val execution: String,
    val jims_tip: String,
    val category: String
)
