package aquarium.spices

abstract class Spice(
    val name: String, val spiciness: String = "mild",
    color: SpiceColor
) : SpiceColor by color {
    abstract fun prepareSpice()
}

data class SpiceContainer(val spice: Spice1) {
    val label: String
        get() = "${spice.name} Container"
}

data class Spice1(val name: String)
class Curry(
    name: String, spiciness: String,
    color: SpiceColor = YellowSpiceColor
) : Spice(name, spiciness, color), Grinder {
    override fun prepareSpice() {
        println("Preparing $name with spiciness $spiciness")
    }

    override val color: Color
        get() = super.color

    override fun grind() {
        println("Grinding $name")
    }
}

//sealed class SpiceColor {
//    object YellowSpiceColor : SpiceColor() {
//        override val color = Color.YELLOW
//    }
//}
//
//enum class Color(val rgb: Int) {
//    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
//}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    YELLOW(0xFFFF00),
    GREEN(0x00FF00),
    BLUE(0x0000FF);
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color: Color = Color.YELLOW
}

interface Grinder {
    fun grind() {
        println("Grinding the spice")
    }
}

fun main() {
    val curry = Curry("Curry", "medium")
    curry.prepareSpice()
    println(curry.color)

    val cumin = Spice1("Cumin")
    val cuminContainer = SpiceContainer(cumin)
    println(cuminContainer.label)

    val paprika = Spice1("Paprika")
    val paprikaContainer = SpiceContainer(paprika)
    println(paprikaContainer.label)
}