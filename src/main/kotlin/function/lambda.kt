package function

fun main() {
   val swim = { println("swim") }()
    swim
//
//    val dirty = 20
//    val waterFilter : (Int) -> Int = {dirty:Int -> dirty/2}
//    println( waterFilter(dirty))
    dirtyProcessor()
}


    var dirty = 20
    val waterFilter : (Int) -> Int = {dirty:Int -> dirty/2}


fun feedFish(dirty : Int ) = dirty+10
fun updateDirty(dirty: Int, operation : (Int) -> Int) : Int {
    return operation(dirty)
}
fun dirtyProcessor() {
    dirty= updateDirty(dirty, waterFilter)
    dirty= updateDirty(dirty, ::feedFish)
    dirty = updateDirty(dirty){ dirty-> dirty+50}
}