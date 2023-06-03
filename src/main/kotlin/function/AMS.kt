package function

import java.util.Random

fun main(args: Array<String>) {
    println("Hello ${args[0]}")

    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val message = "You are ${if (temperature > 50) "fried" else "safe"} fish"
    println(message)

    feedTheFish()
    swim()
}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20,
): Boolean {
    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"
    return when {
        isTooHot -> true
        isDirty -> true
        isSunday -> true
        else -> false
    }

}

fun isTooHot(temperature: Int): Boolean = temperature > 30
fun isDirty(dirty: Int): Boolean = dirty > 30
fun isSunday(day: String): Boolean = day == "Sunday"

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)
    shouldChangeWater(day = "Monday")
    if (shouldChangeWater(day)) {
        println("Change the water today")
    }
}

fun swim(speed: String = "fast") {
    println("swimming $speed")
}

fun randomDay(): String {
    val listDay = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return listDay[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    var food = "fasting"
    return when (day) {
        "Sunday" -> "Chu Nhat"
        "Monday" -> "Thu Hai"
        "Tuesday" -> "Thu Ba"
        "Wednesday" -> "Thu Tu"
        "Thursday" -> "Thu Nam"
        else -> "Con lai"

    }
}
