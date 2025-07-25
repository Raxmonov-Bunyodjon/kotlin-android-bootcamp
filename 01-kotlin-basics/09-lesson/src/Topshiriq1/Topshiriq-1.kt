import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("==== Prava olish tizimi ====")

    var user_name = arrayOfNulls<String>(100)
    var parol_name = arrayOfNulls<String>(100)
    var full_name = arrayOfNulls<String>(100)
    var happy_year = arrayOfNulls<Int>(50)
    var pass_raqam = arrayOfNulls<String>(100)
    var count = 0

    while (true) {
        println("1->Ro'yxatdan o'tish;   2->Tizmiga kirish;   \n3->Jismoniy shaxslarni ma'lumotlarini o'zgartirish;  \n4->Jismoniy shaxslarni ma'lumotlarini o'chirish;   \n5->Barcha jismoniy shaxslarni ko`rish .")
        print("Tanlang: ")
        var n = scanner.nextInt()
        scanner.nextLine()

        when (n) {
            1 -> {
                count = register(scanner, user_name, parol_name, full_name, happy_year, pass_raqam, count)
        }
            2 -> {
                println("Usernameni kiriting: ")
                var username = scanner.next()
                println("Parolni kiriting: ")
                var password = scanner.next()

                var isHave = false
                for (item in 0 until count) {
                    if (user_name[item] == username && parol_name[item] == password) {
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
            4 -> {
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
            5 -> {
                println("Barcha jismoniy shaxslarni ko`rinishi")
                for (item in 0 until count) {
                    println("Username: ${user_name[item]}")
                    println("Parol: ${parol_name[item]}")
                    println("F-I-SH: ${full_name[item]}")
                    println("Tug'ilgan yili: ${happy_year[item]}")
                    println("Passport seria raqami: ${pass_raqam[item]}")
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
    happy_year: Array<Int?>,
    pass_raqam: Array<String?>,
    count: Int
): Int {
    var newCount = count
    try {
        println("Usernameni kiriting: ")
        var username = scanner.nextLine()
        println("Parolni kiriting: ")
        var password = scanner.nextLine()
        println("To`liq ism va familyagizni va o'chistvagizni kiriting:")
        var fullname = scanner.nextLine()
        println("Tug'ilgan yilizni kiriting:")
        var year = scanner.nextInt()
        scanner.nextLine()
        println("Passport seriya va raqamni kiriting:")
        var passraqam = scanner.nextLine()
        var age = 2025 - year
        if (age <= 18) {
            throw IllegalArgumentException("Ro‘yxatdan o‘tish uchun kamida 18 yoshda bo‘lish kerak keyin prava olsa bo`ladi!")
        }

        user_name[newCount] = username
        parol_name[newCount] = password
        full_name[newCount] = fullname
        happy_year[newCount] = year
        pass_raqam[newCount] = passraqam
        newCount++

        println("✅ $fullname muvaffaqiyatli ro'yxatdan o'tdi! Endi guvohnoma olishingiz mumkin.")

    } catch (e: IllegalArgumentException) {
        println("❌ Xatolik: ${e.message}")
    } catch (e: Exception) {
        println("❌ Noma’lum xatolik: ${e.message}")
    }

    return newCount
}

