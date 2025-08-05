enum class Seasons(val weather: String) {

    Summer("Hot") {
        override fun foo() {
            println("Yozda havo issiq bo`ladi!!!")
        }
    },
    Winter("Cold") {
        override fun foo() {
            println("Qishda havo sovuq bo`ladi!!!")
        }
    },
    Rainy("Rain") {
        override fun foo() {
            println("Kuzda havo iliq bo`ladi!!!")
        }
    };

    abstract fun foo()
}