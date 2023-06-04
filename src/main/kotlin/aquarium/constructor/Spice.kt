package aquarium.constructor

class Spice(
    private val name: String,
    private val spiciness: String = "mild",

    ) {
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                else -> 0
            }
        }

    init {
        println("Name : $name, Spiciness: $spiciness, Heat: $heat")
    }
}