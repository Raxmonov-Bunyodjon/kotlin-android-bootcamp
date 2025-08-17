package BehavioralPatterns10

// 1️⃣ Template (asosiy) class
abstract class Beverage {
    // Template Method
    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        addCondiments()
    }

    private fun boilWater() {
        println("Suvni qizdirmoqdamiz...")
    }

    abstract fun brew()

    private fun pourInCup() {
        println("Ichimlikni stakanga quydik.")
    }

    abstract fun addCondiments()
}