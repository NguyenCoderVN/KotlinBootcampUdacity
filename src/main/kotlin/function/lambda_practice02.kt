package function

fun main() {
    val pets = mutableListOf<Pet>()

    addPet(pets, "Fluffy", "cat")
    addPet(pets, "Buddy", "dog")

    feedAllPets(pets)
}

data class Pet(val name: String, val type: String, var hunger: Int = 50)

fun addPet(pets: MutableList<Pet>, name: String, type: String) {
    pets.add(Pet(name, type))
}

fun feedPet(pet: Pet, food: Int = 10) {
    pet.hunger -= food
}

fun feedAllPets(pets: List<Pet>, food: Int = 10) {
    pets.forEach { pet ->
        feedPet(pet, food)
        println("${pet.name} has been fed. Hunger level is now ${pet.hunger}.")
    }
}