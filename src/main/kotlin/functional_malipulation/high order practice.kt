package functional_malipulation

fun List<Int>.filterDivisibleBy3(): List<Int> {
    return this.filter { it % 3 == 0 }
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val result = numbers.filterDivisibleBy3()
    println(result)
}