package Topshiriq4

class RegistrationServiceImpl: RegistrationService {
    private val registeredEmails = HashSet<String>()
    private val users = ArrayList<User>()

    override fun registerUser(user: User) {
        if (!isValidEmail(user.email)) {
            println("❌ Invalid email format: ${user.email}")
            return
        }

        if (registeredEmails.contains(user.email)) {
            println("❗ Email already registered: ${user.email}")
        } else {
            registeredEmails.add(user.email)
            users.add(user)
            println("✅ User registered successfully: ${user.fullName}")
        }
    }

    override fun showAllUsers() {
        if (users.isEmpty()) {
            println("📭 No users registered.")
        } else {
            println("📋 Registered users:")
            users.forEach { println("- ${it.fullName} (${it.email})") }
        }
    }
    private fun isValidEmail(email: String): Boolean {
        val regex = Regex("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$")
        return regex.matches(email)
    }
}