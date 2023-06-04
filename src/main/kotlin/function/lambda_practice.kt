package function

fun main() {
    val listNumber = listOf(1,2,3,4,5,6,7,8,9,10,12)
    val rollDice = {(1..12).random()}
    val rollDice1 = { sides: Int ->
        if (sides == 0) 0 else (1..sides).random()
    }

    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0 else (1..sides).random()
    }
    gamePlay(rollDice1(6))

}

fun gamePlay(roll: Int) {
    println("You rolled a $roll!")
}