package CreationalPatterns2

class PayPalPayment: Payment {
    override fun pay(amount: Double) {
        println("📱 PayPal payment: $$amount")
    }
}