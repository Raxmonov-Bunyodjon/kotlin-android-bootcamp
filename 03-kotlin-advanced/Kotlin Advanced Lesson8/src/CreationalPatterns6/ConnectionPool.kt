package CreationalPatterns6

object ConnectionPool {
    private val pool = mutableListOf<Connection>()
    private const val MAX_CONNECTIONS = 3

    init {
        // dastlab 3 ta connection yaratamiz
        for (i in 1..MAX_CONNECTIONS) {
            pool.add(Connection(i))
        }
    }

    // pool dan connection olish
    fun getConnection(): Connection? {
        return if (pool.isNotEmpty()) {
            val conn = pool.removeAt(0)
            println("Connection ${conn.getId()} is taken from pool")
            conn
        } else {
            println("❗ No available connections, please wait...")
            null
        }
    }

    // ishlatilgan connection ni qaytarish
    fun releaseConnection(conn: Connection) {
        pool.add(conn)
        println("Connection ${conn.getId()} returned to pool")
    }
}