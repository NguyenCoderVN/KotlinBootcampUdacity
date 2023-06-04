package aquarium.inheritance

open class Book(
    val title: String,
    val author: String
) {
    private var currentPage = 0
    open fun readPage() {
        currentPage++
    }
}

class Ebook(
    title: String, author: String,
    var format: String = "text"
) : Book(title, author) {
    private var wordCount = 0
    override fun readPage() {
        wordCount += 250
    }
}