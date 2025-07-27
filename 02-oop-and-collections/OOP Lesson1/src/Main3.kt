import java.util.Scanner

fun main(args: Array<String>) {

    //var users = Array(100){User()}
    var scanner = Scanner(System.`in`)
    var count = 0
    var userList = arrayOfNulls<User>(100)

    while (true) {
        println(
            "1->Ro'yxatdan o'tish;" +
                    "2->Tizimga kirish;" +
                    "3->Userlar ro'yxati;" +
                    "4->Userni o'chirish;" +
                    "5->User ma'lumotlarini o'zgartirish;" +
                    "6->Userni qidirish;"
        )

        var n = scanner.nextInt()

        when (n) {
            1 -> {
                println("Username kiriting:")
                var username = scanner.next()
                println("Password kiriting:")
                var password = scanner.next()
                println("Email kiriting:")
                var email = scanner.next()
                println("Fullname kiriting:")
                var scanner = Scanner(System.`in`)
                var fullName = scanner.nextLine()
                println("Age kiriting:")
                var age = scanner.nextInt()
                var user = User()
                user.username = username
                user.password = password
                user.email = email
                user.fullName = fullName
                user.age = age
                userList[count++] = user
                println("Muvaffaqiyatli ro'yxatga olindi")
            }

            2 -> {
                println("Username kiriting:")
                var username = scanner.next()

                var isUserHave = false
                var index = -1
                for (i in userList.indices) {
                    if (userList[i]?.username == username) {
                        isUserHave = true
                        index = i
                        break
                    }
                }
                if (isUserHave) {
                    println("Parolni kiriting:")
                    var password = scanner.next()
                    if (userList[index]?.password == password) {
                        println("Tizmiga xush kelibsiz!!!")
                    } else {
                        println("Parol xato")
                    }
                } else {
                    println("Bunday user topilmadi.")
                }
            }

            3 -> {
                if (count == 0) {
                    println("Userlar topilmadi")
                } else {
                    for (i in 0 until count) {
                        println(userList[i]?.username + " " + userList[i]?.password)
                    }
                }
            }

            4 -> {
                println("Username kiriting:")
                var username = scanner.next()
                var isDelegateUser = false
                var index = -1
                for (i in userList.indices) {
                    if (userList[i]?.username == username) {
                        isDelegateUser = true
                        index = i
                        break
                    }
                }
                if (isDelegateUser) {
                    for (i in index until count) {
                        userList[i] = userList[i + 1]
                    }
                    userList[count - 1] = null
                    count--
                    println("User o'chirildi")
                } else {
                    println("Bunday user topilmadi")
                }
            }

            5 -> {
                println("Username kiriting:")
                var username = scanner.next()
                var isEditUser = false
                var index = -1
                for (i in userList.indices) {
                    if (userList[i]?.username == username) {
                        isEditUser = true
                        index = i
                        break
                    }
                }
                if (isEditUser) {
                    println("Yangi username kiriting")
                    var newUsername = scanner.next()
                    println("Yangi parolni kiriting:")
                    var newPassword = scanner.next()
                    userList[index]?.username = newUsername
                    userList[index]?.password = newPassword
                    println("Muvaffaqiyatli o'zgartirildi")
                } else {
                    println("User topilmadi")
                }
            }

            6 -> {
                println("Search username kiriting:")
                var searchUsername = scanner.next()
                for (i in 0 until count){
                    if (userList[i]?.username!!.contains(searchUsername)){
                        println(userList[i]?.username+ " "+userList[i]?.password)
                    }
                }
            }
        }
    }
}