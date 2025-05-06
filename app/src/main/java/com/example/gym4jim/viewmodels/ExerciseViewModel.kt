import android.content.res.Resources
import androidx.lifecycle.ViewModel
import com.example.gym4jim.classes.Category
import com.example.gym4jim.classes.Exercise
import com.example.gym4jim.states.ExerciseState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ExerciseViewModel : ViewModel() {
    private val _exerciseState = MutableStateFlow(ExerciseState())
    val exerciseState: StateFlow<ExerciseState> = _exerciseState.asStateFlow()


    init {
        loadExercisesAndCategories();
    }

    fun loadExercisesAndCategories() {
        _exerciseState.value = ExerciseState(categories = allCategories, exercises = allExercises)
    }

    fun getCategories(): List<Category> {
        return exerciseState.value.categories;
    }

    fun getExercises(): List<Exercise> {
        return exerciseState.value.exercises;
    }

    fun getExercisesFromCurrentCategory(): List<Exercise> {
        return exerciseState.value.exercises.filter { exercise ->
            exercise.category.equals(exerciseState.value.currentCategory.name)
        }
    }

    fun onCategoryChosen(category: Category){
        _exerciseState.update { currentState ->
            currentState.copy(
                currentCategory = category
            )
        }
    }

    fun getCurrentCategory(): String {
        return exerciseState.value.currentCategory.name;
    }

    fun onExerciseChosen(exercise: Exercise){
        _exerciseState.update { currentState ->
            currentState.copy(
                currentExercise = exercise
            )
        }
    }

    fun getCurrentExercise(): Exercise {
        return exerciseState.value.currentExercise;
    }

}
