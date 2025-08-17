package CreationalPatterns4

// Pizza class — tayyor obyekt
class Pizza private constructor(
    val dough: String?,
    val cheese: String?,
    val meat: String?,
    val sauce: String?
)    {
// Builder class ichida yoziladi
    class Builder {
        private var dough: String? = null
        private var cheese: String? = null
        private var meat: String? = null
        private var sauce: String? = null

        fun setDough(dough: String) = apply { this.dough = dough }

        fun setCheese(cheese: String) = apply { this.cheese = cheese }

        fun setMeat(meat: String) = apply { this.meat = meat }

        fun setSauce(sauce: String) = apply { this.sauce = sauce }

        fun build(): Pizza {
            return Pizza(dough, cheese, meat, sauce)
        }
    }

    override fun toString(): String {
        return "🍕 Pizza(dough='$dough', cheese='$cheese', meat='$meat', sauce='$sauce')"
    }
}