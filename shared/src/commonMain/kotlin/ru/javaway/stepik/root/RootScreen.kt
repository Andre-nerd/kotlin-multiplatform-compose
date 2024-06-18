package ru.javaway.stepik.root

import androidx.compose.runtime.Composable
import ru.javaway.stepik.setting.SettingScreen
import ru.javaway.stepik.setting.SettingViewModel

@Composable
fun RootScreen(){
    SettingScreen(viewModel = SettingViewModel())
}