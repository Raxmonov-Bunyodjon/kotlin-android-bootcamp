package BehavioralPatterns3

// 3️⃣ Qo‘shish ifodasi
class AddExpression(
    private val left: Expression,
    private val right: Expression
): Expression {
    override fun interpret(): Int = left.interpret() + right.interpret()
}