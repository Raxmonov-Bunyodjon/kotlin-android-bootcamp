package BehavioralPatterns9

// 2) Foizli chegirma (masalan 10% -> 0.10)
class PercentageDiscount(private val rate: Double): PriceStrategy {

    override fun apply(total: Double) = total * (1 - rate)

}