package BehavioralPatterns10

// 4️⃣ Main
fun main(args: Array<String>) {

    val tea = Tea()
    val coffee = Coffee()

    println("---- Choy tayyorlash ----")
    tea.prepareRecipe()

    println("\n---- Qahva tayyorlash ----")
    coffee.prepareRecipe()
}