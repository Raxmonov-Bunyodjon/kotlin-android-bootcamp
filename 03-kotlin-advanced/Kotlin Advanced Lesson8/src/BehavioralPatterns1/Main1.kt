package BehavioralPatterns1

fun main(args: Array<String>) {

    val emailHandler = EmailValidator()
    val passwordHandler = PasswordValidator("123456")
    val adminHandler = AdminCheck()

    // Zanjir tuzish
    emailHandler.setNext(passwordHandler).setNext(adminHandler)

    // Test qilish
    println("--- Test 1 ---")
    emailHandler.handle("user@example.com")

    println("\n--- Test 2 ---")
    emailHandler.handle("admin@example.com")

}