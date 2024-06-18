package ru.javaway.stepik.setting

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SettingScreen(
    modifier: Modifier = Modifier.fillMaxWidth(),
    contentAlignment: Alignment = Alignment.Center,
    viewModel: SettingViewModel
) {
    val state by viewModel.state.collectAsState()
    Box(modifier = modifier, contentAlignment = contentAlignment) {
        Text(text = state.deviceInfo)
    }
}