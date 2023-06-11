package functional_malipulation

fun filterList(
    list: List<Int>,
    predicate: (Int) -> Boolean
): List<Int> {
    val filteredList = mutableListOf<Int>()
    for (item in list) {
        if (predicate(item)) {
            filteredList.add(item)
        }
    }
    return filteredList
}

fun isEven(number: Int) = number % 2 == 0

fun isGreaterThan5(number: Int) = number > 5

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenNumbers = filterList(numbers, ::isEven)
    val greaterThan5Numbers = filterList(numbers, ::isGreaterThan5)

    println("Even numbers: $evenNumbers")
    println("Numbers greater than 5: $greaterThan5Numbers")
}