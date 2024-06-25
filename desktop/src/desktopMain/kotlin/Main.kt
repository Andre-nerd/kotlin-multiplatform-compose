import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import ru.javaway.stepik.root.RootScreen
import ru.javaway.stepik.root.RootViewModel

fun main() {
    application {
        val state = rememberWindowState().apply { size  = DpSize(300.dp, 500.dp) }
        Window(onCloseRequest = {exitApplication()},
            state = state,
            title = "compose multi"
        ){
           RootScreen(RootViewModel())
        }
    }
}