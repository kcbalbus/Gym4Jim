import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Accessibility
import androidx.compose.material.icons.filled.FitnessCenter
import androidx.compose.material.icons.filled.MonitorHeart
import androidx.compose.material.icons.filled.Psychology
import com.example.gym4jim.classes.Category

val allCategories = listOf(
    Category(name = "Gym", icon = Icons.Filled.FitnessCenter),
    Category(name = "Calisthenics", icon = Icons.Filled.Accessibility),
    Category(name = "Cardio", icon = Icons.Filled.MonitorHeart),
    Category(name = "Motivation", icon = Icons.Filled.Psychology)
)
