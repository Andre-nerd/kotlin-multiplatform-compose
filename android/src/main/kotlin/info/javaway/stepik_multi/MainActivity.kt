package info.javaway.stepik_multi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import kotlinx.coroutines.withContext
import ru.javaway.stepik.SayHelloFromCompose
import ru.javaway.stepik.platform.DeviceInfo
import ru.javaway.stepik.root.RootScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RootScreen()
        }

    }
}

