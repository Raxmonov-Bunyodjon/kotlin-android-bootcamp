package BehavioralPatterns9

class Cart {

    private val items = mutableListOf<Double>()
    private var strategy: PriceStrategy = NoDiscount()

    fun add(price: Double) { items += price }

    fun setStrategy(strategy: PriceStrategy) {
        this.strategy = strategy
    }

    fun totalBeforeDiscount(): Double = items.sum()

    fun totalAfterDiscount(): Double = strategy.apply(totalBeforeDiscount())
}