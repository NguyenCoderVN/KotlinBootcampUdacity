package kotlin_basics

//1+1
//res2: kotlin.Int = 2
//
//53-3
//res3: kotlin.Int = 50
//
//50/10
//res4: kotlin.Int = 5
//
//1/2
//res5: kotlin.Int = 0
//
//1.0/2.0
//res6: kotlin.Double = 0.5
//
//6+50
//res7: kotlin.Int = 56
//
//6*50
//res8: kotlin.Int = 300
//
//6*50
//res9: kotlin.Int = 300

//val fish =2
//fish.times(6)
//fish.div(10)
//fish.plus(3)
//fish.minus(3)

// use primitive 'int' as an object
//1.toLong()
//res12: kotlin.Long = 1

// or, put int in a box
//val boxed: Number = 1
//boxed.toLong()
//res13: kotlin.Long = 1

//val aquarium = 1
//aquarium
//res14: kotlin.Int = 1
//
//aquarium = 2
//error: val cannot be reassigned
//aquarium = 2
//^
//
//var fish =2
//fish
//res16: kotlin.Int = 2
//
//fish = 50
//fish
//res17: kotlin.Int = 50
//
//fish = "Bubbles"
//error: type mismatch: inferred type is String but Int was expected
//fish = "Bubbles"
//^
//
//val plants = 5
//val fish = 2
//fish + plants
//res19: kotlin.Int = 7

//var rocks : Int = null
//error: null can not be a value of a non-null type Int
//var rocks : Int = null

//var marbles: Int? = null
//var lotsOfFish: List<String?> = listOf(null, null)
//var everMoreFish: List<String>? = null
//var definitelyFish: List<String?>? = null
//definitelyFish = listOf(null, null)

//val b: Byte = 1
//val i: Int = b
//error: type mismatch: inferred type is Byte but Int was expected
//val i: Int = b
//^

//val b: Byte = 1
//val i: Int = b.toInt()
//i
//res4: kotlin.Int = 1


//val oneMillion = 1_000_000
//val socialSecurityNumber = 999_99_9999L
//val hexBytes = 0xFF_EC_DE_5E
//val bytes =0b11010010_01101001_10010100_10010010


class Goldfish {
    fun eat(){
        println("Yum")
    }
}
//var goldfish: Goldfish? = Goldfish()
//goldfish!!.eat()
//Yum
//
//goldfish = null
//goldfish!!.eat()

//var fishFoodTreats = 5
//return fishFoodTreats?.dec() ?:0