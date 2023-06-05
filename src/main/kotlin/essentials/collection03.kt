package essentials

fun main() {
    val cures = mapOf("white spots" to "Ich", "red sores" to "hole disease")
    println(cures.get("white spots"))
    println(cures["white spots"])

    println(cures.getOrDefault("bloating", "sorry I don't know"))
    println(cures.getOrElse("bloating") { "no cure for this" })

    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber",3)
    inventory.remove("fish net")
    println(inventory)
}