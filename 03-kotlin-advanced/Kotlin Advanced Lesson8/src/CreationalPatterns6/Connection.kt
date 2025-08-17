package CreationalPatterns6

class Connection(private val id: Int) {

    fun connect() {
        println("Connection $id: Connected ✅")
    }

    fun disconnect() {
        println("Connection $id: Disconnected ❌")
    }

    fun getId() = id
}