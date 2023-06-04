package aquarium.constructor

fun main() {
    val smallAquarium = Aquarium(length = 20, wight = 15, height = 30)
    println("Small Aquarium: ${smallAquarium.volume} liters")
    val myAquarium = Aquarium(numberOfFish = 9)

    println(
        "Small Aquarium 2: ${myAquarium.volume} liters with " +
                "length ${myAquarium.length} " +
                "wight ${myAquarium.wight} " +
                "height ${myAquarium.height} "
    )
    val spices = listOf(
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red pepper flakes", "medium")
    )
    println(spices)
    val lessSpicy = spices.filter {
        it.heat <= 3
    }
    println(lessSpicy)
    makeSalt()

}

fun makeSalt() = Spice("salt")