package ru.javaway.stepik.root

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import ru.javaway.stepik.common.ui.AppTheme
import ru.javaway.stepik.common.ui.LocalAppColors
import ru.javaway.stepik.setting.SettingViewModel
import ru.javaway.stepik.setting.compose.SettingScreen

@Composable
fun RootScreen(viewModel: RootViewModel) {

    val state by viewModel.state.collectAsState()
    AppTheme(
        themeIsDark = state.themeIsDark,
        appPrefs = state.appPrefs
    ) {
        Box(modifier = Modifier.fillMaxSize().background(LocalAppColors.current.background)){
            SettingScreen(viewModel = SettingViewModel())
        }

    }

}