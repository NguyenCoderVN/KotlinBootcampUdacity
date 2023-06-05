package essentials

fun main() {
    val testList = listOf(11,12,13,14,15,16,17,18,19,20)
    println(testList.reversed())
}

fun reverseList(list : List<Int>) : List<Int>{
    val result = mutableListOf<Int>()
//    for ( i in 0 until list.size)
    for ( i in list.indices) {
        result.add(list[list.size-i-1])
    }
    return result
}

fun reverseListAgain(list : List<Int>) : List<Int>{
    val result = mutableListOf<Int>()
    for ( i in list.size-1 downTo 0) {
        result.add(list[i])
    }
    return result
}