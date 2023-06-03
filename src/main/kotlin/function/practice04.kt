package function

fun main() {
    println(whatShouldIDoToday("happy", "sunny", 25)) // Go for a walk
    println(whatShouldIDoToday("sad", "rainy", 5)) // Stay in bed
    println(whatShouldIDoToday("tired", temperature = 20)) // Stay home and read
}

fun whatShouldIDoToday(
    mood : String,
    weather : String = "Sunny",
    temperature : Int = 24,

) : String {
    return when {
        mood == "happy" && weather == "sunny" -> "Go for a walk"
        mood == "sad" && weather == "rainy" && temperature < 10 -> "Stay in bed"
        temperature > 35 -> "Go swimming"
        else -> "Stay home and read"
    }
}