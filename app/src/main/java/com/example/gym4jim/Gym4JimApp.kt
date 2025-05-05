package com.example.gym4jim

import ExerciseViewModel
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.gym4jim.ui.screens.CategoryMenuScreen
import com.example.gym4jim.ui.screens.ExerciseMenuScreen

@Composable
fun Gym4JimApp(
    exerciseViewModel: ExerciseViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    val backStackEntry = navController.currentBackStackEntryAsState()
    val currentScreen = AppScreens.values().find { it.route == backStackEntry.value?.destination?.route }
        ?: AppScreens.CategoryMenu

    Scaffold(
        topBar = {
            Gym4JimAppBar(
                canNavigateBack = navController.previousBackStackEntry != null && currentScreen != AppScreens.CategoryMenu,
                navigateUp = { navController.navigateUp() }
            )
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = AppScreens.CategoryMenu.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(AppScreens.CategoryMenu.route) {
                CategoryMenuScreen(
                    exerciseViewModel = exerciseViewModel,
                    onCategorySelected = {
                        exerciseViewModel.onCategoryChosen(it)
                        navController.navigate(AppScreens.ExerciseMenu.route)
                    }
                )
            }
            composable(AppScreens.ExerciseMenu.route) {
                ExerciseMenuScreen(
                    exerciseViewModel = exerciseViewModel,
                    onExerciseSelected = {
                        exerciseViewModel.onExerciseChosen(it)
                        navController.navigate(AppScreens.ExerciseMenu.route)
                    }
                )
            }
        }
    }
}


