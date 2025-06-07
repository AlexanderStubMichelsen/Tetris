import android.graphics.Color


// Enum for Tetromino types
enum class TetrominoType {
    I, O, T, S, Z, L, J
}

// Data class for Tetromino
data class Tetromino(
    val type: TetrominoType,          // Type of the Tetromino
    var shape: Array<IntArray>,       // 2D array representing the shape
    var xPos: Int,                    // X position on the grid
    var yPos: Int,                    // Y position on the grid
    val color: Int                    // Color of the Tetromino
) {
    fun rotate() {
        val height = shape.size
        val width = shape[0].size
        val rotatedShape = Array(width) { IntArray(height) } // Create a new array for rotated shape

        for (i in 0 until height) {
            for (j in 0 until width) {
                // Rotate 90 degrees clockwise
                rotatedShape[j][height - 1 - i] = shape[i][j]
            }
        }
        shape = rotatedShape
    }

    fun moveDown() {
        yPos++ // Move the tetromino down by increasing its y position
    }
}

// Define Tetromino shapes
val TETROMINOS: Map<TetrominoType, Tetromino> = mapOf(
    TetrominoType.I to Tetromino(
        type = TetrominoType.I,
        shape = arrayOf(intArrayOf(1, 1, 1, 1)), // I shape
        xPos = 0,
        yPos = 0,
        color = Color.CYAN
    ),
    TetrominoType.O to Tetromino(
        type = TetrominoType.O,
        shape = arrayOf(intArrayOf(1, 1), intArrayOf(1, 1)), // O shape
        xPos = 0,
        yPos = 0,
        color = Color.YELLOW
    ),
    TetrominoType.T to Tetromino(
        type = TetrominoType.T,
        shape = arrayOf(intArrayOf(0, 1, 0), intArrayOf(1, 1, 1)), // T shape
        xPos = 0,
        yPos = 0,
        color = Color.MAGENTA
    ),
    TetrominoType.S to Tetromino(
        type = TetrominoType.S,
        shape = arrayOf(intArrayOf(0, 1, 1), intArrayOf(1, 1, 0)), // S shape
        xPos = 0,
        yPos = 0,
        color = Color.GREEN
    ),
    TetrominoType.Z to Tetromino(
        type = TetrominoType.Z,
        shape = arrayOf(intArrayOf(1, 1, 0), intArrayOf(0, 1, 1)), // Z shape
        xPos = 0,
        yPos = 0,
        color = Color.RED
    ),
    TetrominoType.J to Tetromino(
        type = TetrominoType.J,
        shape = arrayOf(intArrayOf(1, 0, 0), intArrayOf(1, 1, 1)), // J shape
        xPos = 0,
        yPos = 0,
        color = Color.BLUE
    ),
    TetrominoType.L to Tetromino(
        type = TetrominoType.L,
        shape = arrayOf(intArrayOf(0, 0, 1), intArrayOf(1, 1, 1)), // L shape
        xPos = 0,
        yPos = 0,
        color = Color.rgb(255, 165, 0) // Custom orange color for L
    )
)

// Define grid dimensions
private val gridWidth = 10
private val gridHeight = 20
private val grid = Array(gridHeight) { IntArray(gridWidth) }
