package functional_malipulation

inline fun performOperation(
    a: Int,
    b: Int,
    operation: (Int, Int) -> Int
): Int {
    return operation(a, b)
}

fun add1(a: Int, b: Int) = a + b

fun main() {
    val a = 5
    val b = 3

    val additionResult = performOperation(a, b, ::add1)

    println("Addition: $additionResult")
}