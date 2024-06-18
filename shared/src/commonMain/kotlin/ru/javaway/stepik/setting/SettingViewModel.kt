package ru.javaway.stepik.setting

import ru.javaway.stepik.base.BaseViewModel
import ru.javaway.stepik.platform.DeviceInfo

class SettingViewModel:BaseViewModel<SettingsContract.State, Nothing>() {

    init {
        val deviceInfo = DeviceInfo()
        updateState {
            copy(deviceInfo = deviceInfo.getSummary())
        }
    }
    override fun initialState(): SettingsContract.State {
        return SettingsContract.State.NONE
    }
}