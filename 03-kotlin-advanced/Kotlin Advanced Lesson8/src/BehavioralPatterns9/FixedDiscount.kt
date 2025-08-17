package BehavioralPatterns9

// 3) Fiks summali chegirma (masalan -20 000 so‘m)
class FixedDiscount(private val amount: Double): PriceStrategy {

    override fun apply(total: Double) = (total - amount).coerceAtLeast(0.0)
}