package essentials

class Book(
    val title: String,
    val author: String,
    val year: Int
)

fun Book.getTitleAndAuthor(): Pair<String, String> {
    return title to author
}

fun Book.getInfo(): Triple<String, String, Int> {
    return Triple(title, author, year)
}

fun main() {
    val myBook = Book("The Great Gatsby", "F. Scott Fitzgerald", 1925)
    val (title, author) = myBook.getTitleAndAuthor()
    val (bookTitle, bookAuthor, year) = myBook.getInfo()
    println("Here is your book $title written by $author in $year.")
}