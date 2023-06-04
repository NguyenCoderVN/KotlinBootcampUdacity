package aquarium

class Aquarium {
    var wight: Int = 20
    var height: Int = 40
    val length: Int = 100

    //    fun volume(): Int {
//        return wight * height * length / 1000
//    }
    var volume: Int
        get() = wight * height * length / 1000
        set(value) {
            height = (value * 1000) / (wight * length)
        }

    fun volume() = wight * height * length / 1000

}