package functional_malipulation

fun applyOperation(
    a: Int,
    b: Int,
    operation: (Int, Int) -> Int
): Int {
    return operation(a, b)
}

fun add(a: Int, b: Int) = a + b

fun multiply(a: Int, b: Int) = a * b

fun main() {
    val a = 5
    val b = 3

    val additionResult = applyOperation(a, b, ::add)
    val multiplicationResult = applyOperation(a, b, ::multiply)

    println("Addition: $additionResult")
    println("Multiplication: $multiplicationResult")
}