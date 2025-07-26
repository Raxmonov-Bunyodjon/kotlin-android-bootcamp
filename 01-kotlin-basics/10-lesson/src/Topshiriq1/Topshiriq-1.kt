import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println("==== Ro'yxatdan o'tish tizimini tashkil qilish ====")

    var user_name = arrayOfNulls<String>(100)
    var parol_name = arrayOfNulls<String>(100)
    var full_name = arrayOfNulls<String>(100)
    var gmail_name = arrayOfNulls<String>(100)
    var count = 0

    while (true) {
        println("1->Ro'yxatdan o'tish;   2->Tizmiga kirish;   \n3->Foydalanuvchilar ma'lumotlarini o'zgartirish;  \n4->Foydalanuvchilar ma'lumotlarini o'chirish; \n5->Foydalanuchilarni qidirib topshi;   6->Barcha jismoniy shaxslarni ko`rish .")
        print("Tanlang: ")
        var n = scanner.next()
        scanner.nextLine()

        when (n) {
            "1" -> {
                count = register(scanner, user_name, parol_name, full_name, gmail_name, count)
            }
            "2" -> {
                println("Usernameni yoki Gmailni kiriting: ")
                val usernameOrEmail = scanner.next()
                println("Parolni kiriting: ")
                val password = scanner.next()

                var isHave = false
                for (item in 0 until count) {
                    if ((user_name[item] == usernameOrEmail || gmail_name[item] == usernameOrEmail) && parol_name[item] == password) {
                        isHave = true
                        break
                    }
                }
                if (isHave) {
                    println("Tizimga xush kelibsiz!")
                } else {
                    println("Username yoki parol noto‘g‘ri!")
                }
            }
            "3" -> {
                println("O'zgartirilayotgan usernameni kiriting: ")
                var editUsername = scanner.next()

                var isHave = false
                var index = -1
                for (item in 0 until count) {
                    if (user_name[item] == editUsername) {
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
                    user_name[index] = newUsername
                    parol_name[index] = newPassword
                    println("Muvaffaqiyatli o'zgartirildi!")

                } else {
                    println("Bunday username topilmadi!")
                }
            }
            "4" -> {
                println("O'chirilayotgan usernameni kiriting: ")
                var deleteUsernmae = scanner.next()

                var isHave = false
                var index = -1
                for (item in 0 until count) {
                    if (user_name[item] == deleteUsernmae) {
                        isHave = true
                        index = item
                        break
                    }
                }
                if (isHave) {
                    for (item in index until count-1 ){
                        user_name[item]= user_name[item+1]
                        parol_name[item]= parol_name[item+1]
                    }
                    user_name[count-1]= null
                    parol_name[count-1]= null
                    count--
                    println("Muvaffaqiyatli foydalanuvchi o'chirildi!")

                } else {
                    println("Bunday foydalanuvchi topilmadi!")
                }
            }
            "5"-> {
                println("Qidirilayotgan usernameni kiriting: ")
                var searchUsername = scanner.next()

                for (item in 0 until count) {
                    if (user_name[item] != null && user_name[item]?.lowercase() == searchUsername.lowercase()) {
                        println("Username: ${ user_name[item] }")
                        println("F-I-SH: ${ full_name[item] }")
                        println("Parol: ${ parol_name[item] }")
                        println("Gmail: ${gmail_name[item]}")

                    }
                }
            }
            "6" -> {
                println("Barcha jismoniy shaxslarni ko`rinishi")
                for (item in 0 until count) {
                    println("Username: ${user_name[item]}")
                    println("Parol: ${parol_name[item]}")
                    println("F-I-SH: ${full_name[item]}")
                    println("Gmail: ${gmail_name[item]}")
                    println()
                }
            }

            else -> println("Notog'ri tanlov!")

        }
    }
}

fun register(
    scanner: Scanner,
    user_name: Array<String?>,
    parol_name: Array<String?>,
    full_name: Array<String?>,
    gmail_name: Array<String?>,
    count: Int
): Int {
    println("Usernameni kiriting: ")
    val username = scanner.nextLine()
    println("Parolni kiriting: ")
    val password = scanner.nextLine()
    println("To`liq ism va familiyangizni kiriting:")
    val fullname = scanner.nextLine()
    println("Gmail manzilingizni kiriting:")
    val gmail = scanner.nextLine()

    user_name[count] = username
    parol_name[count] = password
    full_name[count] = fullname
    gmail_name[count] = gmail

    println("✅ $fullname muvaffaqiyatli ro'yxatdan o'tdi!")
    return count + 1
}
