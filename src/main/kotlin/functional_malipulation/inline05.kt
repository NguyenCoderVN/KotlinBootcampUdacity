package functional_malipulation

open class Book(val title: String)

class FictionBook(title: String) : Book(title)

class NonFictionBook(title: String) : Book(title)

inline fun <reified T> List<Book>.filterByType(): List<T> {
    return this.filter { it is T }.map { it as T }
}

fun main() {
    val books = listOf(
        FictionBook("The Great Gatsby"),
        NonFictionBook("The Selfish Gene"),
        FictionBook("To Kill a Mockingbird"),
        NonFictionBook("The Origin of Species")
    )

    val fictionBooks = books.filterByType<FictionBook>()
    val nonFictionBooks = books.filterByType<NonFictionBook>()

    println("Fiction books: $fictionBooks")
    println("Non-fiction books: $nonFictionBooks")
}
//In this example, we use the filterByType inline
// reified function to filter a list of books by
// their type. The function allows us to specify
// the desired type at the call site, and the
// reified type parameter enables the function to
// access the type information at runtime.
