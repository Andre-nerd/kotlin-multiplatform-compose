package ru.javaway.stepik.root.model

import ru.javaway.stepik.base.BaseViewState
import ru.javaway.stepik.common.ui.AppPrefs

object RootContract{

    data class State(
        val themeIsDark:Boolean,
        val firstDayIsMonday:Boolean,
        val selectedTab:AppTab
    ):BaseViewState {
        val appPrefs:AppPrefs
            get() = AppPrefs(firstDayIsMonday = firstDayIsMonday)
        companion object{
            val NONE = State(
                themeIsDark = true,
                firstDayIsMonday = true,
                selectedTab = AppTab.Events
            )
        }
    }
}