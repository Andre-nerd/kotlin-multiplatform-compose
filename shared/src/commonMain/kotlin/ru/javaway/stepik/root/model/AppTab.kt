package ru.javaway.stepik.root.model

sealed interface AppTab {
    data object Events:AppTab
    data object Categories:AppTab
    data object Setting:AppTab
}