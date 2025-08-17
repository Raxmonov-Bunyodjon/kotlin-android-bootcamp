package BehavioralPatterns3

// 5️⃣ Test qilish
fun main(args: Array<String>) {

    // (5 + 3) - 2
    val expression = SubtractExpression(
        AddExpression(NumberExpression(5), NumberExpression(3)),
        NumberExpression(2)
    )

    println("Natija: ${expression.interpret()}") // Natija: 6

}