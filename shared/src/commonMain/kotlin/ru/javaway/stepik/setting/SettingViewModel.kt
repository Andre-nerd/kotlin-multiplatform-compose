package ru.javaway.stepik.setting

import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import ru.javaway.stepik.base.BaseViewModel
import ru.javaway.stepik.platform.DeviceInfo
import ru.javaway.stepik.storage.SettingsManager

class SettingViewModel:BaseViewModel<SettingsContract.State, Nothing>() {

    init {
        SettingsManager.themeIsDarkFlow.onEach {
            updateState { copy(isDarkTheme = it) }

        }.launchIn(viewModelScope)

        val deviceInfo = DeviceInfo()
        updateState {
            copy(deviceInfo = deviceInfo.getSummary())
        }
    }
    override fun initialState(): SettingsContract.State {
        return SettingsContract.State.NONE
    }
    fun switchTheme(isDarkTheme:Boolean){
        SettingsManager.themeIsDark = isDarkTheme
    }
}