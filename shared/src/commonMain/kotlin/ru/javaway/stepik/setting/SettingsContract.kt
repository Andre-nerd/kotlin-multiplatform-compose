package ru.javaway.stepik.setting

import ru.javaway.stepik.base.BaseViewState

class SettingsContract {
    data class State(
        val deviceInfo: String,
        val isDarkTheme:Boolean
    ):BaseViewState {
        companion object{
            val NONE = State(
                deviceInfo = "",
                isDarkTheme = false
            )
        }
    }
}