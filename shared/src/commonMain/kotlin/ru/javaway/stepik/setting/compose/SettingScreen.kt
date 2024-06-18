package ru.javaway.stepik.setting.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.javaway.stepik.setting.SettingViewModel

@Composable
fun SettingScreen(
    modifier: Modifier = Modifier.fillMaxWidth(),
    contentAlignment: Alignment = Alignment.Center,
    viewModel: SettingViewModel
) {
    val state by viewModel.state.collectAsState()
    Box(modifier = modifier, contentAlignment = contentAlignment) {
        Column(modifier =Modifier.padding(16.dp)) {
            Text(text = state.deviceInfo)
            Row(modifier =Modifier, verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Dark theme", modifier = Modifier.weight(1f))
                Checkbox(state.isDarkTheme, onCheckedChange = {viewModel.switchTheme(it)})
            }
        }

    }
}