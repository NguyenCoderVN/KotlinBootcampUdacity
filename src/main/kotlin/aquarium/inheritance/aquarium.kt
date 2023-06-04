package aquarium.inheritance

import java.lang.Math.PI

open class Aquarium(
    var wight: Int = 20,
    var height: Int = 40,
    var length: Int = 100,
) {
    open var volume: Int
        get() = wight * height * length / 1000
        set(value) {
            height = (value * 1000) / (wight * length)
        }

    open var water = volume * 0.9

    constructor(numberOfFish: Int) : this() {
        val water = numberOfFish * 2000 // cm3
        val tank = water + water * 0.1
        height = (tank / (length * wight)).toInt()
    }
}
class TowerTank(): Aquarium() {
    override var volume: Int
        get() = (wight * height * length / 1000 * PI).toInt()
        set(value) {
            height = (value * 1000) / (wight*length)
        }
    override var water = volume*0.8
}