package BehavioralPatterns9

interface PriceStrategy {
    fun apply(total: Double): Double
}