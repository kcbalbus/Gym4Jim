package com.example.gym4jim.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val Gym4JimColorScheme = lightColorScheme(
    primary = DarkGray,
    secondary = LightGray,
    tertiary = Black,
    background = White,
    surface = White,
    onPrimary = White,
    onSecondary = White,
    onTertiary = White,
    onBackground = Black,
    onSurface = Black
)

@Composable
fun Gym4JimTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = Gym4JimColorScheme,
        typography = Typography,
        content = content
    )
}
