package essentials

//fun String.hasSpaces(): Boolean {
//    val found = this.find { it == ' ' }
//    return found != null
//}

fun String.hasSpaces() = this.find { it == ' ' } != null


fun extensionExample() {
    println("Does it have space?".hasSpaces())
}

open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("Green", size)

fun AquariumPlant.isRed() = color == "Red"

//fun AquariumPlant.isBig() = size > 50

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

val AquariumPlant.isGreen: Boolean
    get() = color == "Green"

fun propertyExample() {
    val plant = AquariumPlant("Green", 50)
    plant.isGreen
}

fun staticExample() {
    val plant = GreenLeafyPlant(size = 50)
    plant.print()  // GreenLeafyPlant

    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print() //  AquariumPlant
}

fun AquariumPlant?.pull() {
    this.apply {
        println("removing $this")
    }
}

fun nullableExample() {
    val plant : AquariumPlant? =  null
    plant.pull() // ok
}

fun main() {
    extensionExample()
    staticExample()
    propertyExample()
    nullableExample()
}