package aquarium.spices

abstract class Spice(
    val name: String, val spiciness: String = "mild",
    color: SpiceColor
) : SpiceColor by color{
    abstract fun prepareSpice()
}

class Curry(
    name: String, spiciness: String,
    color: SpiceColor = YellowSpiceColor
) : Spice(name, spiciness, color), Grinder {
    override fun prepareSpice() {
        println("Preparing $name with spiciness $spiciness")
    }

    override val color: String
        get() = super.color

    override fun grind() {
        println("Grinding $name")
    }
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color: String = "Yellow"
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
}