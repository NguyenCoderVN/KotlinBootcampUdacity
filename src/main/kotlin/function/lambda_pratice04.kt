package function
class Location(val width: Int, val height: Int) {
    val map = Array(width) { arrayOfNulls<String>(height) }

    init {
        // Initialize your map with descriptions for each location
    }

    fun updateLocation(x: Int, y: Int) {
        // Update the user's location and prevent walking off the map
    }
}

class Game {
    private val location = Location(4, 4)
    private var x = 0
    private var y = 0

    private val north = { y = (y - 1).coerceAtLeast(0); location.updateLocation(x, y) }
    private val south = { y = (y + 1).coerceAtMost(location.height - 1); location.updateLocation(x, y) }
    private val east = { x = (x + 1).coerceAtMost(location.width - 1); location.updateLocation(x, y) }
    private val west = { x = (x - 1).coerceAtLeast(0); location.updateLocation(x, y) }
    private val end = { println("Game Over") }

    fun move(where: () -> Unit) {
        where()
    }

    fun makeMove(direction: String?) {
        when (direction) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}

fun main() {
    val game = Game()
    while (true) {
        print("Enter a direction: n/s/e/w:")
        val input = readLine()
        game.makeMove(input)
    }
}