package BehavioralPatterns10

// 2️⃣ Subclass: Choy
class Tea: Beverage() {

    override fun brew() {
        println("Choy bargini damlamoqdamiz...")
    }

    override fun addCondiments() {
        println("Limon qo‘shildi.")
    }
}