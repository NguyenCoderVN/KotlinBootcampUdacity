package functional_malipulation

class Game1(
    private val mapWidth: Int,
    private val mapHeight: Int
) {
    private var currentLocation = Location(0, 0)

    private val map = Array(mapWidth) {
        arrayOfNulls<String>(mapHeight)
    }

    init {
        for (i in 0 until mapWidth) {
            for (j in 0 until mapHeight) {
                map[i][j] = "You are at ($i, $j)"
            }
        }
    }

    fun move(where: () -> Boolean) {
        if (where()) {
            println("You moved to ${currentLocation.getDescription()}")
        } else {
            println("You cannot move in that direction.")
        }
    }

    fun makeMove(direction: String?) {
        when (direction) {
            "n" -> move { currentLocation.moveNorth(mapHeight) }
            "s" -> move { currentLocation.moveSouth(mapHeight) }
            "e" -> move { currentLocation.moveEast(mapWidth) }
            "w" -> move { currentLocation.moveWest(mapWidth) }
            else -> move { false }
        }
    }
}

class Location(private var x: Int, private var y: Int) {
    fun moveNorth(mapHeight: Int): Boolean {
        if (y > 0) {
            y--
            return true
        }
        return false
    }

    fun moveSouth(mapHeight: Int): Boolean {
        if (y < mapHeight - 1) {
            y++
            return true
        }
        return false
    }

    fun moveEast(mapWidth: Int): Boolean {
        if (x < mapWidth - 1) {
            x++
            return true
        }
        return false
    }

    fun moveWest(mapWidth: Int): Boolean {
        if (x > 0) {
            x--
            return true
        }
        return false
    }

    fun getDescription(): String {
        return "(${x}, ${y}): ${toString()}"
    }

    override fun toString(): String {
        return "You are at (${x}, ${y})"
    }
}

fun main() {
    val game = Game1(4, 4)

    while (true) {
        println("Enter a direction: n/s/e/w:")
        val input = readlnOrNull()
        game.makeMove(input)
    }
}