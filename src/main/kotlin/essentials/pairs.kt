package essentials


fun main() {
    val equipment = "fishnet" to "catching fish"
    println(equipment.first)
    println(equipment.second)
    val equipment1 = "fishnet" to "catching fish" to "of big size" to "and strong"
    println(equipment1)
    val equip = ("fishnet" to "catching fish") to ("of big size" to "and strong")
    val fishnet = "fishnet" to "catching fish"
    val (tool, use) = fishnet
    println("The $tool is a tool for $use")
    val fishnetString = fishnet.toString()
    println(fishnetString)
    println(fishnet.toList())
    val (tool1, use1) = giveMeATool()
    println("The $tool1 is a tool for $use1")
}

fun giveMeATool () : Pair<String, String> {
    return ("fishnet1" to "catching fish1")
}