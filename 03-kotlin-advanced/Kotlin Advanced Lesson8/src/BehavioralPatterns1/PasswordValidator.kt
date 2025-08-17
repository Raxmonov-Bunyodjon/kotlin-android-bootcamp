package BehavioralPatterns1

class PasswordValidator(private val password: String): AbstractHandler() {
    override fun handle(request: String): Boolean {
        if (password.length < 6) {
            println("❌ Parol juda qisqa!")
            return false
        }
        println("✅ Parol uzunligi yaxshi")
        return super.handle(request)
    }
}