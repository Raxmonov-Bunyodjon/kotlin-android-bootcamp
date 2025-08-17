import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    var a = arrayOfNulls<String>(100)
    var b = arrayOfNulls<String>(100)
    var count = 0

    while (true) {
        println(
            "1->Ro'yxatdan o'tish;" +
                    "2->Tizimga kirish;" +
                    "3->Foydalanuvchi ma'lumotlarini o'zgartirish;" +
                    "4->Foydalanuvchini qidirish;" +
                    "5->Foydalanuvchini o'chirish." +
                    "6->Foydalanuvchilarni ko`rish."
        )
        var n = scanner.nextInt()

        when (n) {
            1 -> {
                    println("Usernameni kiriting: ")
                    var username = scanner.next()
                    println("Parolni kiriting: ")
                    var password = scanner.next()
                    a[count] = username
                    b[count] = password
                    count++

                    println("Muvaffaqiyatli ro'yxatdan o'tildi!")

                }

            2 -> {
                println("Usernameni kiriting: ")
                var username = scanner.next()
                println("Parolni kiriting: ")
                var password = scanner.next()

                var isHave = false
                for (item in 0 until count) {
                    if (a[item] == username && b[item] == password) {
                        isHave = true
                        break
                    }
                }
                if (isHave) {
                    println("Tizimga xush kelibsiz")
                } else {
                    println("Username yoki parol xato!")
                }
            }

            3 -> {
                println("O'zgartirilayotgan usernameni kiriting: ")
                var editUsername = scanner.next()

                var isHave = false
                var index = -1
                for (item in 0 until count) {
                    if (a[item] == editUsername) {
                        isHave = true
                        index = item
                        break
                    }
                }
                if (isHave) {
                    println("Yangi username kiriting: ")
                    var newUsername = scanner.next()
                    println("Yangi parolni kiriting: ")
                    var newPassword = scanner.next()
                    a[index] = newUsername
                    b[index] = newPassword
                    println("Muvaffaqiyatli o'zgartirildi!")

                } else {
                    println("Bunday username topilmadi!")
                }
            }

            4 -> {
                println("Qidirilayotgan usernameni kiriting: ")
                var searchUsername = scanner.next()

                for (item in 0 until count) {
                    if (a[item] != null && a[item]?.lowercase() == searchUsername.lowercase()) {
                        println(a[item])
                        println(b[item])
                    }
                }
            }

            5 -> {
                println("O'chirilayotgan usernameni kiriting: ")
                var deleteUsernmae = scanner.next()

                var isHave = false
                var index = -1
                for (item in 0 until count) {
                    if (a[item] == deleteUsernmae) {
                        isHave = true
                        index = item
                        break
                    }
                }
                if (isHave) {
                    for (item in index until count-1 ){
                        a[item]= a[item+1]
                        b[item]= b[item+1]
                    }
                    a[count-1]= null
                    b[count-1]= null
                    count--
                    println("Muvaffaqiyatli foydalanuvchi o'chirildi!")

                } else {
                    println("Bunday foydalanuvchi topilmadi!")
                }
            }

            6 -> {
                for (item in 0 until count) {
                    println(a[item])
                    println(b[item])
                    println()
                }
            }
        }
    }
}