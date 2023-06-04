package aquarium.interfaces

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val pleco = Plecostomus1()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim() {
        println("Swim")
    }
}

interface FishAction1 {
    fun eat()
}

interface FishColor {
    val color: String
}

abstract class AquariumFish1 : FishAction1 {
    abstract val color: String
    override fun eat() = println("yum")
}

abstract class Spice {

}
class Plecostomus1(
    fishColor: FishColor = GoldColor
) : FishAction1 by PrintingFishAction("a lot of algae"),
    FishColor by fishColor

object GoldColor : FishColor {
    override val color = "gold"
}

object RedColor : FishColor {
    override val color = "red"
}

class PrintingFishAction(private val food: String) : FishAction1 {
    override fun eat() {
        println(food)
    }
}