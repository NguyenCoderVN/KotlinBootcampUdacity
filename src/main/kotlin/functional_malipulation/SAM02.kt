package functional_malipulation

fun main() {
    val actionExecutor = ActionExecutor()

    // Using an anonymous object implementing MyAction interface
    actionExecutor.execute(object : MyAction {
        override fun performAction() {
            println("Performing action using anonymous object")
        }
    })

    // Using a lambda expression with SAM conversion
    actionExecutor.execute {
        println("Performing action using lambda expression")
    }
}