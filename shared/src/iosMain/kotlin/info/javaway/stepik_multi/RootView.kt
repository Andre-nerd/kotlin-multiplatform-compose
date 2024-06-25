package info.javaway.stepik_multi

import androidx.compose.ui.window.ComposeUIViewController
import ru.javaway.stepik.root.RootScreen
import ru.javaway.stepik.root.RootViewModel

fun MainViewController() = ComposeUIViewController { RootScreen(RootViewModel()) }