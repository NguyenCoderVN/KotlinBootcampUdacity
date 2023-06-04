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
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    repeat(2) {
        println("The fish is swimming")
    }

//    val noValue = for (x in 1..10){ }
//    val notThisEither = while (false) { }

    val decoration = listOf("rock", "pagoda", "plastic plan", "alligator", "flowerpot")
    println(decoration.filter { true })
    println(decoration.filter { it[0] == 'p' })

    eagerExample()
}


fun getDirtySensorReading() = 20

fun makeNewAquarium() = println("Building a new aquarium..")

fun aquariumStatusReport(aquarium: Any = makeNewAquarium()) {

}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = getDirtySensorReading(),
): Boolean {
    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }

}

fun isTooHot(temperature: Int): Boolean = temperature > 30
fun isDirty(dirty: Int): Boolean = dirty > 30
fun isSunday(day: String): Boolean = day == "Sunday"

fun eagerExample() {
    val decoration = listOf("rock", "pagoda", "plastic plan", "alligator", "flowerpot")
    val eager = decoration.filter { it[0] == 'p' }
    println(eager)
    // apply filter lazy
    val eagerLazy = decoration.asSequence().filter { it[0] == 'p' }
    println(eagerLazy)
    println(eagerLazy.toList())
    // apply map lazy
    val lazyMap = decoration.asSequence().map {
        println("map $it ")
        it
    }
    println(lazyMap)
    println("First ${lazyMap.first()}")
    println("All ${lazyMap.toList()}")
    val spices =
        listOf("curry", "curryaadadad", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    val spices01 = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println(spices01)
//    val spices02 = spices.filter { it.startsWith('c') && it.endsWith('e') }
    val spices02 = spices
        .filter { it.startsWith('c') }
        .filter { it.endsWith('e') }

    println(spices02)
    val spices03 = spices.take(3).filter { it.startsWith('c') }
    println(spices03)

}

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
