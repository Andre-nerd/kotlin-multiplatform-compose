package ru.javaway.stepik.setting.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.javaway.stepik.common.ui.AppThemeProvider
import ru.javaway.stepik.common.ui.LocalAppColors
import ru.javaway.stepik.setting.SettingViewModel

@Composable
fun SettingScreen(
    modifier: Modifier = Modifier.fillMaxWidth(),
    contentAlignment: Alignment = Alignment.Center,
    viewModel: SettingViewModel
) {
    val state by viewModel.state.collectAsState()
    Box(
        modifier = modifier,
        contentAlignment = Alignment.TopCenter
    ) {
        Column {
            Card(
                modifier = Modifier.padding(16.dp),
                backgroundColor = LocalAppColors.current.surface,
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = state.deviceInfo,
                    modifier = Modifier.padding(16.dp),
                    color = LocalAppColors.current.onSurface
                )
            }

            Row(
                modifier = Modifier.padding(16.dp).background(AppThemeProvider.colors.surface),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "Dark theme",
                    modifier = Modifier.weight(1f).padding(16.dp),
                    color = LocalAppColors.current.onSurface
                )
                Checkbox(
                    state.isDarkTheme,
                    onCheckedChange = { viewModel.switchTheme(it) },
                    colors = CheckboxDefaults.colors(
                        checkedColor = AppThemeProvider.colors.accent,
                        uncheckedColor = AppThemeProvider.colors.onSurface
                    )
                )
            }
        }

    }
}