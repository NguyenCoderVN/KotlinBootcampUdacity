package function

import kotlin.math.tan

fun main() {
    println(canAddFish(10.0, listOf(3, 3, 3)))
    println(canAddFish(8.0, listOf(2, 2, 2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1, 1, 3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}

fun canAddFish(
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true,
): Boolean {
    var sizeCurrentFish = 0
    for (i in currentFish) {
        sizeCurrentFish += i
    }
    return if (hasDecorations) {
        tankSize * 0.8 >= sizeCurrentFish + fishSize
    } else {
        tankSize >= (sizeCurrentFish + fishSize)
    }
}