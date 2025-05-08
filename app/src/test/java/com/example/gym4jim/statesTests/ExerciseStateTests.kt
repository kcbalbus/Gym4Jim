import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Category
import org.junit.Assert.*
import org.junit.Test
import androidx.compose.material.icons.filled.FitnessCenter
import com.example.gym4jim.classes.Category
import com.example.gym4jim.classes.Exercise
import com.example.gym4jim.states.ExerciseState
import com.example.gym4jim.R

class ExerciseStateTest {

    @Test
    fun testExerciseStateInitialization() {
        val exerciseState = ExerciseState()

        assertTrue(exerciseState.categories.isEmpty())
        assertTrue(exerciseState.exercises.isEmpty())
        assertEquals("", exerciseState.currentCategory.name)
        assertEquals(Icons.Filled.Category, exerciseState.currentCategory.icon)
        assertEquals("", exerciseState.currentExercise.id)
        assertEquals("", exerciseState.currentExercise.name)
        assertEquals(0, exerciseState.currentPhoto)
        assertEquals(0, exerciseState.currentVideo)
    }

    @Test
    fun testExerciseStateWithData() {
        val category = Category(name = "Gym", icon = Icons.Filled.FitnessCenter)
        val exercise = Exercise(
            id = "benchpress",
            name = "Bench press",
            image_files = listOf(R.drawable.benchpress_photo),
            video_file = R.raw.benchpress_video,
            description = "The bench press builds strength...",
            execution = "Lie flat...",
            jims_tip = "Press till you make it to the press!!",
            category = "Gym"
        )

        val exerciseState = ExerciseState(
            categories = listOf(category),
            exercises = listOf(exercise),
            currentCategory = category,
            currentExercise = exercise,
            currentPhoto = R.drawable.benchpress_photo,
            currentVideo = R.raw.benchpress_video
        )

        assertEquals(1, exerciseState.categories.size)
        assertEquals("Gym", exerciseState.categories[0].name)
        assertEquals(1, exerciseState.exercises.size)
        assertEquals("benchpress", exerciseState.exercises[0].id)
        assertEquals("Bench press", exerciseState.exercises[0].name)
        assertEquals("Gym", exerciseState.currentCategory.name)
        assertEquals("benchpress", exerciseState.currentExercise.id)
        assertEquals("Bench press", exerciseState.currentExercise.name)
        assertEquals(R.drawable.benchpress_photo, exerciseState.currentPhoto)
        assertEquals(R.raw.benchpress_video, exerciseState.currentVideo)
    }
}
