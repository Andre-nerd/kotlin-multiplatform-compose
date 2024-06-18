package info.javaway.stepik_multi

import androidx.compose.ui.window.ComposeUIViewController
import ru.javaway.stepik.SayHelloFromCompose

fun MainViewController() = ComposeUIViewController { SayHelloFromCompose() }