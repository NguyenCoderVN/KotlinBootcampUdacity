package aquarium.interfaces

fun main() {
    makeFish()
}

fun feedFish(fish : FishAction) {
    // make some food then
    fish.eat()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color} \n Plecostomus: ${pleco.color}")
    shark.eat()
    pleco.eat()
}