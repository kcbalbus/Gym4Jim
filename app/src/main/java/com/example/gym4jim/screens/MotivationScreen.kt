package com.example.gym4jim.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.gym4jim.ui.components.*
import com.example.gym4jim.R
import com.example.gym4jim.classes.allMotivationalAudio
import com.example.gym4jim.classes.allMotivationalQuotes
import java.time.LocalDate

@Composable
fun MotivationScreen(
    onVideoClicked: (Int) -> Unit,
) {
    val dayOfMonth = LocalDate.now().dayOfMonth
    val dailyQuote = allMotivationalQuotes.get(dayOfMonth-1)
    val videoId = R.raw.motivational_video_1
    val audioId = allMotivationalAudio.get(dayOfMonth % allMotivationalAudio.size)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {

        JimsMessage(message = "Hit the gym - meet buddies get baddies.")

        Spacer(modifier = Modifier.height(12.dp))

        SubsectionHeader(title = "Video of the Day")
        VideoPlayer(
            videoResId = videoId,
            onVideoClicked = onVideoClicked
        )

        Spacer(modifier = Modifier.height(12.dp))

        SubsectionHeader(title = "Quote of the Day")
        MotivationQuote(quote = dailyQuote.quote, author = dailyQuote.author)

        Spacer(modifier = Modifier.height(12.dp))

        SubsectionHeader(title = "Audio of the Day")
        AudioPlayer(audioResId = audioId)

        Spacer(modifier = Modifier.height(12.dp))
    }
}
