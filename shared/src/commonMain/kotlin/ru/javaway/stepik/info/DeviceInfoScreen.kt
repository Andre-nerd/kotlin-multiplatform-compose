package ru.javaway.stepik.info

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.ModalDrawer
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ru.javaway.stepik.platform.DeviceInfo

@Composable
fun DeviceInfoScreen(){
    Box(modifier = Modifier.fillMaxWidth())
    Text(text = DeviceInfo().getSummary())
}