package kotlin_basics

import kotlin.math.pow

//val myList = mutableListOf("tuna", "salmon", "shark")
//myList = mutableListOf("koi", "goldfish")
//error: val cannot be reassigned
//myList = mutableListOf("koi", "goldfish")
//^
//
//val myList = mutableListOf("tuna", "salmon", "shark")
//myList.remove("shark")
//res1: kotlin.Boolean = true
//
//val fish = 12
//val plants = 5
//val swarm = listOf(fish, plants)


//val school = arrayOf("tuna","salmon", "shark")
//
//val number = intArrayOf(1,2,3)
//
//import java.util.*
//
//println(Arrays.toString(intArrayOf(2,"foo")))
//error: type mismatch: inferred type is String but Int was expected
//println(Arrays.toString(intArrayOf(2,"foo")))tln(Arrays.toString(kotlin.intArrayOf(2,"foo")))

//val mix = arrayOf("fish", 2)
//
//import java.util.*
//
//println(Arrays.toString(mix))
//[fish, 2]


//var fish = 12
//var plants = 15
//
//val swarm = listOf(fish,plants)
//val bigSwarm = arrayOf(swarm, arrayOf("dolphin", "whale", "orka"))
//
//import java.util.*
//
//println(Arrays.toString(bigSwarm))
//[[12, 15], [Ljava.lang.String;@15651402]


//val array = Array(5) {it*2}
//println(array.asList())
//[0, 2, 4, 6, 8]

//
//var fish = 12
//var plants = 5
//
//val swarm = listOf(fish,plants)
//val bigSwarm = arrayOf(swarm, arrayOf("dolphin", "whale", "orka"))
//
//for (element in swarm) println(element)
//125
//
//for ((index, element) in swarm.withIndex()) {
//    println("Fish at $index is $element")
//}
//Fish at 0 is 12Fish at 1 is 5
//
//for (i in 'b'..'g') println(i)
//bcdefg
//
//for (i in 1..5) println(i)
//12345
//
//for (i in 5 downTo 1) println(i)
//54321
//
//for (i in 3..6 step 2) println(i)
//35

fun main() {
    val array = Array(7) {1000.0.pow(it)}
    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
        "terabyte", "petabyte", "exabyte")
    for ((i, value) in array.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }
}