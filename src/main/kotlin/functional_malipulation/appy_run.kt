package functional_malipulation

data class Person(var name: String, var age: Int)

fun main() {
    // Using apply
    val person = Person("", 0).apply {
        name = "John Doe"
        age = 25
    }
    println("Using apply: $person")

    // Using run
    val greeting = person.run {
        val isAdult = if (age >= 18) "an adult" else "a minor"
        "Hello, my name is $name, and I am $isAdult."
    }
    println("Using run: $greeting")

    // Using also
    val updatedPerson = person.also {
        it.age += 1
    }
    println("Using also: $updatedPerson")

    // Using let
    val nameLength = person.let {
        it.name.length
    }
    println("Using let: Name length is $nameLength")

    // Using with
    val description = with(person) {
        "This person's name is $name and they are $age years old."
    }
    println("Using with: $description")
}


//apply: We use apply to create and
// initialize a Person object.
//run: We use run to create a
// greeting message based on the
// Person object's properties.
//also: We use also to update
// the Person object's age and
// return the updated object.
//let: We use let to calculate the
// length of the Person object's name
// and return the result.
//with: We use with to create a description
// of the Person object based on its properties.