package online.devdisplay.tetris

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import online.devdisplay.tetris.ui.theme.TetrisTheme
import online.devdisplay.tetris.ui.GameView // Ensure this import is correct

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TetrisTheme {
                GameScreen()
            }
        }
    }
}

@Composable
fun GameScreen() {
    // Integrate GameView into Jetpack Compose using AndroidView
    AndroidView(factory = { context ->
        GameView(context) // Create an instance of GameView
    })
}
