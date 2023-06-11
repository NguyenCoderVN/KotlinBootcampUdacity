package functional_malipulation

open class Animal(val name: String)

class Dog(name: String) : Animal(name)

class Cat(name: String) : Animal(name)

inline fun <reified T> List<Animal>.filterByType(): List<T> {
    return this.filter { it is T }.map { it as T }
}
//In this example, we define an inline
//function filterByType with a reified
// type parameter T.
// The function filters a list of
// Animal objects based on the type of
// its elements and returns a new list
// of the specified type T.

fun main() {
    val animals = listOf(
        Dog("Buddy"),
        Cat("Whiskers"),
        Dog("Max"),
        Cat("Mittens")
    )

    val dogs = animals.filterByType<Dog>()
    val cats = animals.filterByType<Cat>()

    println("Dogs: $dogs")
    println("Cats: $cats")
}

//In this example, we use the filterByType
// inline reified function to filter a
// list of animals by their type.
// The function allows us to specify the
// desired type at the call site, and the
// reified type parameter enables the function
// to access the type information at runtime.