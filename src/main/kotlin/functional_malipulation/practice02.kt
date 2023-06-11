package functional_malipulation

class Game2 {
    var x = 0
    var y = 0

    private val map = arrayOf(
        arrayOf("You are in the top-left corner of the map."),
        arrayOf("You are in the top-right corner of the map."),
        arrayOf("You are in the bottom-left corner of the map."),
        arrayOf("You are in the bottom-right corner of the map.")
    )

    fun move(where: () -> Unit) {
        where()
    }

    fun makeMove(direction: String?) {
        when (direction) {
            "n" -> move { if (y > 0) y-- }
            "s" -> move { if (y < map.size - 1) y++ }
            "w" -> move { if (x > 0) x-- }
            "e" -> move { if (x < map[0].size - 1) x++ }
            else -> move { println("Game over!") }
        }
        updateLocation()
    }

    private fun updateLocation() {
        val location = map[y][x]
        println(location)
    }
}

fun main() {
    val game = Game2()

    while (true) {
        print("Enter a direction: n/s/e/w:")
        val direction = readlnOrNull()
        game.makeMove(direction)
    }
}
