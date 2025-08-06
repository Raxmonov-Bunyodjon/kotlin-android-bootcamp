package Topshiriq6

import java.util.Random
import java.util.Scanner


sealed class Download {
    class Info:Download(){
        var fileName:String = ""
        var fileSize:Double = 1.0
        var downloadTime:Int = 1

        fun createInfo(){
            var scanner = Scanner(System.`in`)
            var random = Random()

            println("Fayl nomini kiriting")
            fileName = scanner.next()
            println("Fayl hajmini kiriting")
            fileSize = scanner.nextDouble()
            downloadTime = random.nextInt(100)
        }
        fun showInfo(){
            println("Fayl nomi - $fileName\n" +
                    "Fayl hajmi - $fileSize\n" +
                    "Faylni yuklash tahminiy vaqti - $downloadTime\n sekund")
        }
    }

    class Success:Download(){
        fun showStatusDownlod() {
            println("Yuklab olish muvaffaqiyatli kechdi")
        }

    }

    class Failure:Download(){
        fun showStatusDownlod() {
            println("Yuklab olish muvaffaqiyatsiz kechdi")
        }

    }

    class Loading:Download(){
        fun showStatusDownlod() {
            println("Fayl yulanmoqda")
        }

    }
}