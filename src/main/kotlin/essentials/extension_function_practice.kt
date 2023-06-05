package essentials

class Book2(val title: String, val author: String, var pages: Int) {
    // class definition
}

fun Book2.weight(): Double {
    return pages * 1.5
}

fun Book2.tornPages(numPages: Int) {
    pages -= numPages
}

class Puppy {
    fun playWithBook(book: Book2) {
        val numPagesTorn = (1..book.pages).random()
        book.tornPages(numPagesTorn)
    }
}

fun main(args: Array<String>) {
    val myBook = Book2("The Catcher in the Rye", "J.D. Salinger", 200)
    val myPuppy = Puppy()
    while (myBook.pages > 0) {
        myPuppy.playWithBook(myBook)
    }
}