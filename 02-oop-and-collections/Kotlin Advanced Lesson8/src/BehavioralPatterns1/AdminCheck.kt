package BehavioralPatterns

class AdminCheck: AbstractHandler() {
    override fun handle(request: String): Boolean {
        if (request == "admin@example.com") {
            println("👑 Admin tizimga kirdi")
        } else {
            println("👤 Oddiy foydalanuvchi")
        }
        return super.handle(request)
    }
}