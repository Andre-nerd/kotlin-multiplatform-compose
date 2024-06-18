package ru.javaway.stepik

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.javaway.stepik.platform.DeviceInfo

fun sayHello(){
    println("Hi from Stepik multi")
}

@Composable
fun SayHelloFromCompose(){
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text(text = "Hello from Compose")
    }
}