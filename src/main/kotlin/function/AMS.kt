package function

import java.util.Random

fun main(args: Array<String>) {
    println("Hello ${args[0]}")

    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val message = "You are ${ if (temperature > 50) "fried" else "safe"} fish"
    println(message)

    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = "pellets"
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String {
val listDay = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday")
    return listDay[Random().nextInt(7)]
}
