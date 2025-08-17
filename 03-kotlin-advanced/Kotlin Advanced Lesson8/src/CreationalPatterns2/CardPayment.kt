package CreationalPatterns2

class CardPayment: Payment {
    override fun pay(amount: Double) {
        println("💳 Card payment: $$amount")
    }
}