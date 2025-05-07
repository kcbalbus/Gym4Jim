package com.example.gym4jim.ui.components

import android.net.Uri
import android.view.View
import android.widget.FrameLayout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Fullscreen
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView

@Composable
fun VideoPlayer(
    videoResId: Int,
    onVideoClicked: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val videoUri = remember {
        Uri.parse("android.resource://${context.packageName}/$videoResId")
    }

    val exoPlayer = remember {
        ExoPlayer.Builder(context).build().apply {
            setMediaItem(MediaItem.fromUri(videoUri))
            prepare()
            playWhenReady = false
        }
    }

    val isControllerVisible = remember { mutableStateOf(true) }

    DisposableEffect(Unit) {
        onDispose {
            exoPlayer.release()
        }
    }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(240.dp)
            .background(color = Color.Black)
    ) {
        AndroidView(
            factory = {
                PlayerView(context).apply {
                    player = exoPlayer
                    useController = true
                    layoutParams = FrameLayout.LayoutParams(
                        FrameLayout.LayoutParams.MATCH_PARENT,
                        FrameLayout.LayoutParams.MATCH_PARENT
                    )
                    setControllerVisibilityListener(
                        object : PlayerView.ControllerVisibilityListener {
                            override fun onVisibilityChanged(visibility: Int) {
                                isControllerVisible.value = visibility == View.VISIBLE
                            }
                        }
                    )
                }
            },
            modifier = Modifier.matchParentSize()
        )

        if (isControllerVisible.value) {
            IconButton(
                onClick = { onVideoClicked(videoResId) },
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(8.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.Fullscreen,
                    contentDescription = "Fullscreen",
                    tint = Color.White,
                    modifier = Modifier.size(32.dp)
                )
            }
        }
    }
}
