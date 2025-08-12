package Topshiriq4

fun main(args: Array<String>) {
//Ro'yxatdan o'tish tizimini yarating. Bunda email qayta takrorlanmasligini ko'rsatib bering.

    val service = RegistrationServiceImpl()

    val user1 = User(
        fullName = "Ali Valiyev",
        email = "ali@example.com",
        password = "password123"
    )

    val user2 = User(
        fullName = "Karim Sodiqov",
        email = "karim@example.com",
        password = "secure456"
    )

    val user3 = User(
        fullName = "Duplicate Ali",
        email = "ali@example.com", // ❗ Duplicate email
        password = "newpass789"
    )

    println("➕ Registering user 1:")
    service.registerUser(user1)

    println("\n➕ Registering user 2:")
    service.registerUser(user2)

    println("\n➕ Registering user 3 (duplicate email):")
    service.registerUser(user3)

    println("\n📋 Showing all registered users:")
    service.showAllUsers()

}