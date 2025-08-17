package CreationalPatterns2

class CashPayment: Payment {
    override fun pay(amount: Double) {
        println("💸 Cash payment: $$amount")
    }
}