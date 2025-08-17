package BehavioralPatterns10

class Coffee: Beverage() {
    override fun brew() {
        println("Qahva donasini damlamoqdamiz...")
    }

    override fun addCondiments() {
        println("Shakar qo‘shildi.")
    }
}