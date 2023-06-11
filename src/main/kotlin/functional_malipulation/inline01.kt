package functional_malipulation

inline fun measureExecutionTime(action: () -> Unit) {
    val startTime = System.currentTimeMillis()
    action()
    val endTime = System.currentTimeMillis()
    println("Execution time: ${endTime - startTime} ms")
}

fun calculateSum(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    return sum
}

fun main() {
    measureExecutionTime {
        val sum = calculateSum(1_000_000)
        println("Sum: $sum")
    }
}