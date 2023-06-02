package kotlin_basics

fun main() {
    val remainingFish = (((2.plus(71)).plus(233)).minus(13))
    println(remainingFish)
    val aquariumsNeeded = remainingFish.div(30)
    println(aquariumsNeeded)

    var rainbowColor = "Yellow"
    rainbowColor = "Blue"
    println(rainbowColor)

    val blackColor = "Black"
//    blackColor = "White" // ERROR


//    rainbowColor = null  // ERROR

    var greenColor : String? = null
    var blueColor = null

    var list2Null = listOf(null, null)
    var list = null

    var nullTest: Int? = null
    val result = nullTest?.plus(1) ?: 10
    println(result)


}