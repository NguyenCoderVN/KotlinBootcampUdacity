package functional_malipulation

fun main() {
    val strings = listOf("apple", "banana", "cherry")
    val result = strings.joinToString(
        separator = ", ", prefix = "Fruits: ", postfix = "."
    )
    println(result)

    val numbers = listOf(1, 2, 3, 4, 5)
    val result1 = numbers.joinToString(
        separator = " - ", prefix = "Numbers: ", postfix = "."
    )
    println(result1)
}