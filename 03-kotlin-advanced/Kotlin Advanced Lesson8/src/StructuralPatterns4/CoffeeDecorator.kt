package StructuralPatterns4

// Dekorator bazasi
open class CoffeeDecorator(private val decoratedCoffee: Coffee): Coffee {

    override fun cost() = decoratedCoffee.cost()

    override fun description() = decoratedCoffee.description()
}