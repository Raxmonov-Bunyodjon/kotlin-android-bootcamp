package BehavioralPatterns3

// 2️⃣ Son ifodasi
class NumberExpression(private val number: Int): Expression {

    override fun interpret(): Int = number
}