package BehavioralPatterns9

fun main(args: Array<String>) {

    val cart = Cart()
    cart.add(120_000.0)
    cart.add(80_000.0)
    cart.add(50_000.0)

    println("Jami (chegir­masiz): ${cart.totalBeforeDiscount()} so‘m")

    // 1) Chegirma yo‘q
    cart.setStrategy(NoDiscount())
    println("NoDiscount: ${cart.totalAfterDiscount()} so‘m")

    // 2) 10% chegirma
    cart.setStrategy(PercentageDiscount(0.10))
    println("10% chegirma: ${cart.totalAfterDiscount()} so‘m")

    // 3) 20 000 so‘m fiks chegirma
    cart.setStrategy(FixedDiscount(20_000.0))
    println("−20 000 so‘m: ${cart.totalAfterDiscount()} so‘m")
}