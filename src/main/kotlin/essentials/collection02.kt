package essentials

fun main() {
    val symptoms = mutableListOf("white sports","red spots", "not eating", "bloated", "helly up")
    symptoms.add("white fungus")
    symptoms.remove("white fungus")

    symptoms.contains("red") // false
    symptoms.contains("red spots") // true

    println(symptoms.subList(4, symptoms.size)) // belly up

    listOf(1,5,3).sum() // 9
    listOf("a","b","cc").sumOf { it.length } // 9

}