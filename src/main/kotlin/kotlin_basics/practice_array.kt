package kotlin_basics

fun main() {
    val numbers = arrayOf(11,12,13,14,15)
    //val mutableListString = mutableListOf<String>()
    val mutableListString: MutableList<String> = mutableListOf()

    for (item in numbers) {
        mutableListString.add(item.toString())
    }

    println(mutableListString)

    val mutableListInt: MutableList<Int> = mutableListOf()
    for (i in 0..100) {
        if (i%7==0){
            mutableListInt.add(i)
        }
    }
    println(mutableListInt)
}