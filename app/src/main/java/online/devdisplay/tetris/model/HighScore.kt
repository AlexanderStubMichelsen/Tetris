package online.devdisplay.tetris.model

data class HighScore(
    val playerName: String = "",
    val score: Int = 0,
    val timestamp: Long = 0L
)
