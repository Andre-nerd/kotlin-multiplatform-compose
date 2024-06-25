package ru.javaway.stepik.root

import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import ru.javaway.stepik.base.BaseViewModel
import ru.javaway.stepik.storage.SettingsManager

class RootViewModel:BaseViewModel<RootContract.State,Nothing>() {
    init {
        SettingsManager.themeIsDarkFlow.onEach {isDark ->
            updateState { copy(themeIsDark = isDark) }
        }.launchIn(viewModelScope)
    }
    override fun initialState(): RootContract.State = RootContract.State.NONE
}