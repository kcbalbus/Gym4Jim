package com.example.gym4jim.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gym4jim.ui.theme.Gym4JimTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person

@Composable
fun CategoryMenuItem(
    text: String,
    icon: ImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.tertiary),
        modifier = modifier
            .fillMaxWidth()
            .height(110.dp)
            .clickable { onClick() }
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onPrimary,
                modifier = Modifier.size(40.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = text,
                style = MaterialTheme.typography.displayLarge,
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuItemCardPreview() {
    Gym4JimTheme {
        CategoryMenuItem(
            text = "Klatka piersiowa",
            icon = Icons.Default.Person,
            onClick = {}
        )
    }
}
