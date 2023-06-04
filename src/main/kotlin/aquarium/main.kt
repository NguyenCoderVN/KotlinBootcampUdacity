package aquarium

fun main() {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("wight is ${myAquarium.wight}")
    println("height is ${myAquarium.height}")
    println("length is ${myAquarium.length}")
    println("Volume is ${myAquarium.volume}")
    myAquarium.height = 80
    println("wight is ${myAquarium.wight}")
    println("height is ${myAquarium.height}")
    println("length is ${myAquarium.length}")

    println("Volume is ${myAquarium.volume}")

}