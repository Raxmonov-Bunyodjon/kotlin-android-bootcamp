package CreationalPatterns6

fun main(args: Array<String>) {

    // 1-connection olamiz
    val c1 = ConnectionPool.getConnection()
    c1?.connect()

    // 2-connection olamiz
    val c2 = ConnectionPool.getConnection()
    c2?.connect()

    // 3-connection olamiz
    val c3 = ConnectionPool.getConnection()
    c3?.connect()

    // 4-chi urinish (yo‘q, chunki max=3)
    val c4 = ConnectionPool.getConnection()

    // c1 ni qaytaramiz
    c1?.disconnect()
    if (c1 != null) ConnectionPool.releaseConnection(c1)

    // endi yana olish mumkin
    val c5 = ConnectionPool.getConnection()
    c5?.connect()
}