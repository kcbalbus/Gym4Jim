package com.example.gym4jim.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gym4jim.R
import com.example.gym4jim.ui.theme.Gym4JimTheme

@Composable
fun JimsMessage(
    message: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.jim_image),
            contentDescription = "Jim",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(96.dp)
                .clip(RoundedCornerShape(8.dp))
                .border(
                    BorderStroke(3.dp, Color.Black),
                    shape = RoundedCornerShape(8.dp)
                )
        )

        Spacer(modifier = Modifier.width(10.dp))

        Surface(
            shape = RoundedCornerShape(16.dp),
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier
                .height(96.dp)
                .weight(1f)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = message,
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(10.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun JimsMessagePreview() {
    Gym4JimTheme {
        JimsMessage(
            message = "Nie zapomnij napić się wody między seriami!",
        )
    }
}
