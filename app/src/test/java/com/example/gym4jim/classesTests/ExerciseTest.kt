package com.example.gym4jim.classesTests

import com.example.gym4jim.R
import com.example.gym4jim.classes.Exercise
import org.junit.Assert
import org.junit.Test

class ExerciseTest {

    @Test
    fun testExerciseCreation() {
        val exercise = Exercise(
            id = "1",
            name = "Bench Press",
            image_files = listOf(R.drawable.benchpress_photo),
            video_file = R.raw.benchpress_video,
            description = "A classic chest exercise.",
            execution = "Push the barbell upwards while lying on a bench.",
            jims_tip = "Keep your feet flat on the ground.",
            category = "Strength"
        )

        Assert.assertEquals("Bench Press", exercise.name)
        Assert.assertEquals("Strength", exercise.category)
        Assert.assertEquals(1, exercise.image_files.size)
        Assert.assertNotNull(exercise.video_file)
    }
}