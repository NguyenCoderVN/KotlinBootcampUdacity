// Define a custom annotation with a single parameter called "category"
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class BookCategory(val category: String)

// Apply the custom annotation to a class called "Book"
@BookCategory(category = "Ficjjjtion")
class Book(
    val title: String,
    val author: String,
    private val price: Double
) {
    // Function to get the book's price
    fun getPrice(): Double {
        return price
    }
}

// Main function to manage the book store
fun main() {
    // Create a list of books
    val books = listOf(
        Book("To Kill a Mockingbird",
            "Harper Lee", 10.99),
        Book("1984",
            "George Orwell", 8.99),
        Book("The Catcher in the Rye",
            "J.D. Salinger", 7.99),
        Book("Pride and Prejudice",
            "Jane Austen", 12.99),
        Book("The Great Gatsby",
            "F. Scott Fitzgerald", 9.99)
    )

    // Get the total price of all books in the "Fiction" category
    val totalFictionPrice = books.filter {
        it.javaClass.isAnnotationPresent(BookCategory::class.java) && it.javaClass.getAnnotation(BookCategory::class.java).category == "Fiction"
    }
        .sumOf { it.getPrice() }
    println("Total price of Fiction books: $$totalFictionPrice")
}