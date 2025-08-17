package CreationalPatterns4

fun main(args: Array<String>) {

    // 1-variant: Oddiy pizza
    val pizza1 = Pizza.Builder()
        .setDough("Yupqa non")
        .setCheese("Mozzarella")
        .setMeat("Tovuq go'shti")
        .setSauce("Ketchup")
        .build()

    println(pizza1)

    // 2-variant: Maxsus pizza
    val pizza2 = Pizza.Builder()
        .setDough("Qalin non")
        .setCheese("Parmesan")
        .setMeat("Mol go'shti")
        .setSauce("Mayonez")
        .build()

    println(pizza2)

    // 3-variant: Faqat vegetarian pizza
    val pizza3 = Pizza.Builder()
        .setDough("Yupqa non")
        .setCheese("Mozzarella")
        .setSauce("Pesto")
        .build()

    println(pizza3)
}