package StructuralPatterns4

fun main(args: Array<String>) {

    // Oddiy kofe
    var coffee: Coffee = SimpleCoffee()
    println("${coffee.description()} -> Narxi: ${coffee.cost()} so'm")

    // Sut qo‘shamiz
    coffee = MilkDecorator(coffee)
    println("${coffee.description()} -> Narxi: ${coffee.cost()} so'm")

    // Shakar qo‘shamiz
    coffee = SugarDecorator(coffee)
    println("${coffee.description()} -> Narxi: ${coffee.cost()} so'm")
}