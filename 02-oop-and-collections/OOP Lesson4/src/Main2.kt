import java.util.Scanner

fun main(args: Array<String>) {

    var registrationService = RegistrationServiceImpl()
    var scanner = Scanner(System.`in`)

    while (true) {
        println(
            "1->Add user;" +
                    "2->Users list;" +
                    "3->Delete user;" +
                    "4->Edit user;" +
                    "5->Search user;"+
                    "6->Show users."
        )
        var n = scanner.nextInt()
        when (n) {

            1 -> {
                registrationService.addUser()
            }

            2 -> {
                registrationService.listUser()
            }

            3 -> {
                registrationService.deleteUser()
            }

            4-> {
                registrationService.editUser()
            }

            5->{
                registrationService.searchUser()
            }
            6->{
                registrationService.show()
            }
            else -> ("Bunday qiymat mavjud emas!")


        }
    }
}