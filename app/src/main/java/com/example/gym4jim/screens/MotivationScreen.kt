package com.example.gym4jim.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.gym4jim.ui.components.*
import com.example.gym4jim.R
import com.example.gym4jim.classes.allMotivationalQuotes
import java.time.LocalDate

@Composable
fun MotivationScreen() {
    val dayOfMonth = LocalDate.now().dayOfMonth
    val dailyQuote = allMotivationalQuotes.get(dayOfMonth-1)

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        JimsMessage(message = "Hit the gym - meet buddies get baddies.")

        Spacer(modifier = Modifier.height(12.dp))

        SubsectionHeader(title = "Video of the Day")
        VideoPlayer(videoResId = R.raw.motivational_video)

        Spacer(modifier = Modifier.height(12.dp))

        SubsectionHeader(title = "Quote of the Day")
        MotivationQuote(quote = dailyQuote.quote, author = dailyQuote.author)

        Spacer(modifier = Modifier.height(12.dp))

        SubsectionHeader(title = "Audio of the Day")
        AudioPlayer(audioResId = R.raw.motivational_audio)
    }
}
