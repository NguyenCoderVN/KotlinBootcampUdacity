package essentials

// Create a top-level constant for the maximum number of books a person could borrow
const val MAX_BOOKS_BORROWED = 5

// Create a Book class
class Book1(private val title: String, val author: String, val year: Int) {
    companion object Constants {
        const val BASE_URL = "https://www.example.com/books/"
    }

    private var currentBorrowedBooks = 0

    fun canBorrow(): Boolean {
        return currentBorrowedBooks < MAX_BOOKS_BORROWED
    }

    fun printUrl() {
        println("${Constants.BASE_URL}${title}.html")
    }
}

fun main() {
    val myBook = Book1("The Great Gatsby", "F. Scott Fitzgerald", 1925)
    val canBorrow = myBook.canBorrow()
    myBook.printUrl()
    println("Can the user borrow the book? $canBorrow")
}