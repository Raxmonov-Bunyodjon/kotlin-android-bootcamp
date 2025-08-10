package Topshiriq2

data class Card(
    val cardNumber: String,
    val ownerName: String,
    var balance: Double
) {
    fun deposit(amount: Double) {
        balance += amount
    }

    fun withdraw(amount: Double): Boolean {
        return if (balance >= amount) {
            balance -= amount
            true
        } else false
    }
}