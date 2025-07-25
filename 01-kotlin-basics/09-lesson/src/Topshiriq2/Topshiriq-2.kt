import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    try {
        println("Yoshingizni kiriting: ")
        val age = scanner.nextInt()
        if (age < 18) throw Exception("Siz 18 yoshga to‘lmagansiz.")

        println("Futbol o`ynaysizmi? (true/false): ")
        val futbol = scanner.nextBoolean()
        if (!futbol) throw Exception("Jismoniy holatingiz yaxshi emas:D")

        println("Xotiniz bormi? (true/false): ")
        val juftlik = scanner.nextBoolean()
        if (!juftlik) throw Exception("Unda uylaning brodar!")

        println("Qachon to'y 2025mi? (true/false): ")
        val toy = scanner.nextBoolean()
        if (toy) throw Exception("Unda 2026da tezroq uylaning bro :)")

        println("Nazariy imtihondan o‘tganmisiz? (true/false): ")
        val exam = scanner.nextBoolean()
        if (!exam) throw Exception("Siz nazariy imtihondan o‘tmadingiz.")

        println("✅ Tabriklayman! Siz haydovchilik guvohnomasi olishga haqlisiz.")

    } catch (e: Exception) {
        println(e.message)
    }
}