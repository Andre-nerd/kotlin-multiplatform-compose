package ru.javaway.stepik.root.compose

import ru.javaway.stepik.root.model.AppTab

data class BottomBarItem (
    val title:String,
    val appTab:AppTab
){
    companion object{
        fun getItems():List<BottomBarItem> = listOf(
            BottomBarItem(title = "Events", AppTab.Events),
            BottomBarItem(title = "Categories", AppTab.Categories),
            BottomBarItem(title = "Setting", AppTab.Setting)
        )
    }
}