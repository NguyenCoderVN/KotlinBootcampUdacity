package kotlin_basics

fun main() {
    val trout = "trout"
    val haddock = "haddock"
    val snapper = "snapper"

    println("I do not like $trout $haddock $snapper")

    val fishName = "fish"
    when (fishName.length) {
        0 -> println("Error")
        in 3..12 -> println("Good fish name")
        else -> println("Ok fish name")
    }
}