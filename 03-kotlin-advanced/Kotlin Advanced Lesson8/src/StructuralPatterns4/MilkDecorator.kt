package StructuralPatterns4

// Sut qo‘shadigan dekorator
class MilkDecorator(coffee: Coffee):CoffeeDecorator(coffee) {

    override fun cost() = super.cost() + 3

    override fun description() = super.description() + ", Sut"
}

