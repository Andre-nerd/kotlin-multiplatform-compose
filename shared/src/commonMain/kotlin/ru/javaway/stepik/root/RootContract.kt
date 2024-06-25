package ru.javaway.stepik.root

import ru.javaway.stepik.base.BaseViewState
import ru.javaway.stepik.common.ui.AppPrefs

object RootContract{

    data class State(
        val themeIsDark:Boolean,
        val firstDayIsMonday:Boolean
    ):BaseViewState {
        val appPrefs:AppPrefs
            get() = AppPrefs(firstDayIsMonday = firstDayIsMonday)
        companion object{
            val NONE = State(
                themeIsDark = true,
                firstDayIsMonday = true
            )
        }
    }
}