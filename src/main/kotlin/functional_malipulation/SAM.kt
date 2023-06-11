package functional_malipulation

fun main() {
    val a = 5
    val b = 3

    // Using anonymous class
    val sum = MathOperations.performOperation(
        a, b
    ) { a, b -> a + b }
    println("Sum: $sum")

    // Using lambda expression (SAM conversion)
    val difference = MathOperations.performOperation(a, b) { x, y -> x - y }
    println("Difference: $difference")
}