package com.example.gym4jim.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.gym4jim.R

val RobotoMedium = FontFamily(
    Font(R.font.roboto_medium, FontWeight.Medium)
)

val RobotoRegular = FontFamily(
    Font(R.font.roboto_regular, FontWeight.Normal)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = RobotoMedium,
        fontWeight = FontWeight.Medium,
        fontSize = 36.sp
    ),
    displayMedium = TextStyle(
        fontFamily = RobotoMedium,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp
    ),
    displaySmall = TextStyle(
        fontFamily = RobotoRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp
    ),
    bodySmall = TextStyle(
        fontFamily = RobotoRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 17.sp
    ),
)
