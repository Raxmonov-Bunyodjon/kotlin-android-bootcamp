package Topshiriq3

fun main(args: Array<String>) {
    val abonentlar = listOf(
        Abonent().apply {
            setAttributes(
                mapOf(
                    "id" to 1,
                    "lastName" to "Raxmonov",
                    "firstName" to "Bunyodjon",
                    "middleName" to "Baxodir o'g'li",
                    "address" to "Sirdaryo",
                    "creditCardNumber" to 1234567812345678L,
                    "debit" to 200000.0,
                    "credit" to 100000.0,
                    "localCallTime" to 500,
                    "longDistanceTime" to 1000
                )
            )
        },
        Abonent().apply {
            setAttributes(
                mapOf(
                    "id" to 2,
                    "lastName" to "Karimov",
                    "firstName" to "Sardor",
                    "middleName" to "Alisher o'g'li",
                    "address" to "Toshkent",
                    "creditCardNumber" to 2222333344445555L,
                    "debit" to 100000.0,
                    "credit" to 50000.0,
                    "localCallTime" to 400,
                    "longDistanceTime" to 200
                )
            )
        },
        Abonent().apply {
            setAttributes(
                mapOf(
                    "id" to 3,
                    "lastName" to "Akbarov",
                    "firstName" to "Javlon",
                    "middleName" to "Olim o'g'li",
                    "address" to "Andijon",
                    "creditCardNumber" to 3333444455556666L,
                    "debit" to 80000.0,
                    "credit" to 30000.0,
                    "localCallTime" to 300,
                    "longDistanceTime" to 0
                )
            )
        }
    )

    println("1. Shaharlararo > shahar suhbatlar:")
    abonentlar
        .filter { it.getLongDistanceTime() > it.getLocalCallTime() }
        .forEach { it.printInfo() }

    println("\n2. Alfavit tartibda:")
    abonentlar
        .sortedBy { it.getLastName() }
        .forEach { it.printInfo() }

    println("\n3. Shaharlararo suhbatdan foydalanmaganlar:")
    abonentlar
        .filter { it.getLongDistanceTime() == 0 }
        .forEach { it.printInfo() }
}