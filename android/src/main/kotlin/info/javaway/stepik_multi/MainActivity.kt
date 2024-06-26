package info.javaway.stepik_multi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.javaway.stepik.root.compose.RootScreen
import ru.javaway.stepik.root.RootViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RootScreen(RootViewModel())
        }

    }
}

