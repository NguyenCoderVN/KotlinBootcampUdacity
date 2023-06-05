package essentials

fun main() {
    // Create a set of book titles
    val allBooks = setOf("Hamlet", "Romeo and Juliet", "Macbeth")

// Create a map that associates the set of books to the author
    val library = mapOf("William Shakespeare" to allBooks)

// Use any() function to see if any of the books are "Hamlet"
    val hasHamlet = library.any { it.value.contains("Hamlet") }

// Create a mutable map called moreBooks and add one title/author to it
    val moreBooks = mutableMapOf("The Catcher in the Rye" to "J.D. Salinger")

// Use getOrPut() to see whether a title is in the map, and if the title is not in the map, add it
    moreBooks.getOrPut("To Kill a Mockingbird") { "Harper Lee" }

// Print out the results
    println("The library contains books by the following authors: ${library.keys}")
    println("Does the library have Hamlet? $hasHamlet")
    println("More books: $moreBooks")
}