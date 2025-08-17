package BehavioralPatterns9

// 1) Chegirma yo‘q
class NoDiscount: PriceStrategy {

    override fun apply(total: Double) = total

}