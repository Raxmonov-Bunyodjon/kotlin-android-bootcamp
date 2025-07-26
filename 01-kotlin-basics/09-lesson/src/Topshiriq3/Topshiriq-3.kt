import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    try {
        println("Sizning internet trafikgingiz qancha qoldi (masaln: 100, 200, 1000, mgbayt)")
        print("Kiriting:>>>")
        var mytrafic = scanner.nextInt()
        println("Sizning internetdan yuklab olayotgan file hajmi qancha (masaln: 100, 200, 1000, mgbayt)")
        print("Kiriting:>>>")
        var netfile = scanner.nextInt()
        var qoldiq = mytrafic - netfile

        if (qoldiq<0) {
            throw Exception("Internet trafikiz yetarli emas. Sizda faqat $mytrafic MB bor.")
        } else {
            println("Fayl muvaffaqiyatli yuklab olindi! Qolgan trafik: $qoldiq MB")
        }
    } catch (e: Exception) {
        println("Xatolik: ${e.message}")
    }
}