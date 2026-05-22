package com.realmobservasi.app.ui.theme

import androidx.compose.foundation.isSystemInDarkMode
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF22c55e),
    secondary = Color(0xFFfacc15),
    tertiary = Color(0xFF60a5fa),
    background = Color(0xFF07111f),
    surface = Color(0xFF13263d),
    error = Color(0xFFff6b6b)
)

@Composable
fun RealmObservasiTheme(
    darkTheme: Boolean = isSystemInDarkMode(),
    content: @Composable () -> Unit
) {
    val colorScheme = DarkColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}