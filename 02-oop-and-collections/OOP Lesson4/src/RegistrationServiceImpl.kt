import java.util.Scanner

class RegistrationServiceImpl : RegistrationService, RegistrationService2 {    //implements
    var scanner = Scanner(System.`in`)
    var userList = arrayOfNulls<User>(100)
    var count = 0

    override fun addUser() {

        println("Username:")
        var username = scanner.next()
        println("Password:")
        var password = scanner.next()
        var user = User(username, password)
        userList[count++] = user
    }

    override fun listUser() {
        for (i in 0 until count) {
            println(userList[i])
        }
    }

    override fun deleteUser() {
        println("O'chirilayotgan usernameni kiriting: ")
        val deleteUsername = scanner.next()

        var isHave = false
        var index = -1

        for (i in 0 until count) {
            val user = userList[i]
            if (user != null && user.username == deleteUsername) {
                isHave = true
                index = i
                break
            }
        }

        if (isHave) {
            for (i in index until count - 1) {
                userList[i] = userList[i + 1]
            }
            userList[count - 1] = null
            count--

            println("Muvaffaqiyatli foydalanuvchi o'chirildi!")
        } else {
            println("Bunday foydalanuvchi topilmadi!")
        }
    }

    override fun editUser() {
        println("O'zgartirilayotgan usernameni kiriting: ")
        val editUsername = scanner.next()

        var isHave = false
        var index = -1

        for (i in 0 until count) {
            val user = userList[i]
            if (user != null && user.username == editUsername) {
                isHave = true
                index = i
                break
            }
        }

        if (isHave) {
            println("Yangi username kiriting: ")
            val newUsername = scanner.next()
            println("Yangi password kiriting: ")
            val newPassword = scanner.next()

            // userList[index] null emasligiga ishonch hosil qilamiz
            val user = userList[index]
            if (user != null) {
                user.username = newUsername
                user.password = newPassword
                println("Muvaffaqiyatli o'zgartirildi!")
            }
        } else {
            println("Bunday username topilmadi!")
        }
    }


    override fun searchUser() {
        println("Qidirilayotgan usernameni kiriting: ")
        val searchUsername = scanner.next()
        var isFound = false

        for (i in 0 until count) {
            val user = userList[i]
            if (user != null && user.username.lowercase() == searchUsername.lowercase()) {
                println("Foydalanuvchi topildi:")
                println("Username: ${user.username}")
                println("Password: ${user.password}")
                isFound = true
                break
            }
        }

        if (!isFound) {
            println("Bunday username topilmadi.")
        }
    }

    override fun show() {
        println("Barcha jismoniy shaxslar ro'yxati:")

        if (count == 0) {
            println("Hech qanday foydalanuvchi mavjud emas.")
            return
        }

        for (i in 0 until count) {
            val user = userList[i]
            if (user != null) {
                println("Username: ${user.username}")
                println("Password: ${user.password}")
                println("────────────")
            }
        }
    }
}


