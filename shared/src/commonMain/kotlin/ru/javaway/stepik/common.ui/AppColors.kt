package ru.javaway.stepik.common.ui

import androidx.compose.ui.graphics.Color

data class AppColors(
    val accent: Color,
    val background: Color,
    val surface: Color,
    val onBackground: Color,
    val onSurface: Color
)

val lightPalette = AppColors(
    accent = Color(0xFF805610),
    background = Color(0xFFFFF8F4),
    surface = Color(0xFFFFF8F4),
    onBackground = Color(0xFF201B13),
    onSurface = Color(0xFF201B13)
)
val darkPalette = AppColors(
    accent = Color(0xFFF9C172),
    background = Color(0xFF18120B),
    surface = Color(0xFF4F4539),
    onBackground = Color(0xFFEDE0D4),
    onSurface = Color(0xFFD7C8B8)
)