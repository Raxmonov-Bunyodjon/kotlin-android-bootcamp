package CreationalPatterns1

object Logger {
    private val logs = mutableListOf<String>()

    fun log(message: String) {
        logs.add(message)
        println("Log added: $message")
    }

    fun showLogs() {
        println("---- All Logs ----")
        logs.forEach { println(it) }
    }
}