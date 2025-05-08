import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Accessibility
import androidx.compose.material.icons.filled.FitnessCenter
import com.example.gym4jim.classes.Category
import com.example.gym4jim.classes.Exercise
import com.example.gym4jim.states.ExerciseState
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import kotlinx.coroutines.flow.collect

class ExerciseViewModelTest {

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    private val viewModel = ExerciseViewModel()

    @Test
    fun testLoadExercisesAndCategories() = runBlockingTest {
        viewModel.loadExercisesAndCategories()
        val categories = viewModel.getCategories()
        val exercises = viewModel.getExercises()

        Assert.assertTrue(categories.isNotEmpty())
        Assert.assertTrue(exercises.isNotEmpty())
    }

    @Test
    fun testGetExercisesFromCurrentCategory() = runBlockingTest {
        val category = Category("Gym", Icons.Filled.FitnessCenter)
        viewModel.onCategoryChosen(category)

        val exercises = viewModel.getExercisesFromCurrentCategory()
        Assert.assertTrue(exercises.all { it.category == category.name })
    }

    @Test
    fun testOnCategoryChosen() = runBlockingTest {
        val category = Category("Calisthenics", Icons.Filled.Accessibility)
        viewModel.onCategoryChosen(category)

        Assert.assertEquals("Calisthenics", viewModel.getCurrentCategory())
    }

    @Test
    fun testOnExerciseChosen() = runBlockingTest {
        val exercise = Exercise("pushup", "Push-up", listOf(), 0, "", "", "", "Calisthenics")
        viewModel.onExerciseChosen(exercise)

        Assert.assertEquals(exercise, viewModel.getCurrentExercise())
    }

    @Test
    fun testOnPhotoChosen() = runBlockingTest {
        val photoId = 123
        viewModel.onPhotoChosen(photoId)

        Assert.assertEquals(photoId, viewModel.getCurrentPhoto())
    }

    @Test
    fun testOnVideoChosen() = runBlockingTest {
        val videoId = 456
        viewModel.onVideoChosen(videoId)

        Assert.assertEquals(videoId, viewModel.getCurrentVideo())
    }
}
