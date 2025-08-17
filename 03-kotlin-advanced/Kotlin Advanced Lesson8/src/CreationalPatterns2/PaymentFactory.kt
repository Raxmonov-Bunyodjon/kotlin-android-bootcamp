package CreationalPatterns2

object PaymentFactory {
    fun createPayment(type: String): Payment {
        return when(type.lowercase()) {
            "card" -> CardPayment()
            "cash" -> CashPayment()
            "paypal" -> PayPalPayment()
            else -> throw IllegalArgumentException("❌ Unknown payment type: $type")
        }
    }
}