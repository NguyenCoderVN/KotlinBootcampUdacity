package classes

object MobyDickWhale {
    val author = "Herman Melville"
    fun jump() {}

}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}

sealed class Seal

object SeaLion : Seal()
object Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when (seal) {
        SeaLion -> "SeaLion"
        Walrus -> "Walrus"
    }
}