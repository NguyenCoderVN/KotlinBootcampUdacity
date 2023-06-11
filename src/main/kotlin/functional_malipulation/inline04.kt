package functional_malipulation

inline fun <reified T> printType(value: T) {
    println("The type of the value is: ${T::class.simpleName}")
}

fun main() {
    val intValue = 42
    val stringValue = "Hello, world!"

    printType(intValue) // Output: The type of the value is: Int
    printType(stringValue) // Output: The type of the value is: String
}