package BehavioralPatterns

class EmailValidator: AbstractHandler() {
    override fun handle(request: String): Boolean {
        if (!request.contains("@")) {
            println("❌ Email formati noto‘g‘ri!")
            return false
        }
        println("✅ Email to‘g‘ri")
        return super.handle(request)
    }
}