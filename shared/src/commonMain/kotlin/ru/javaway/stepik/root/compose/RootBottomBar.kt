package ru.javaway.stepik.root.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.javaway.stepik.common.ui.AppThemeProvider
import ru.javaway.stepik.root.model.AppTab

@Composable
fun BoxScope.RootBottomBar(
    selectedTab: AppTab,
    clickOnTab:(AppTab) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                AppThemeProvider.colors.surface,
                shape = RoundedCornerShape(topStart = 22.dp, topEnd = 22.dp)
            )
            .align(Alignment.BottomCenter)
            .padding(8.dp)
    ) {
        BottomBarItem.getItems().forEach { item ->
            BottomBarItemView(item, item.appTab == selectedTab){
                clickOnTab(item.appTab)
            }
        }

    }
}

@Composable
fun RowScope.BottomBarItemView(
    bottomBarItem: BottomBarItem,
    isSelected: Boolean,
    clickOnTab: () -> Unit
) {
    val foreground =
        if (isSelected) AppThemeProvider.colors.accent else AppThemeProvider.colors.onSurface
    Column(
        modifier = Modifier
            .weight(1f)
            .padding(4.dp).
            clickable { clickOnTab() },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(bottomBarItem.title, color = foreground)

    }

}