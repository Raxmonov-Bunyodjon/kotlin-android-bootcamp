package BehavioralPatterns3

// 4️⃣ Ayirish ifodasi
class SubtractExpression(
    private val left: Expression,
    private val right: Expression
): Expression {
    override fun interpret(): Int = left.interpret() - right.interpret()

}