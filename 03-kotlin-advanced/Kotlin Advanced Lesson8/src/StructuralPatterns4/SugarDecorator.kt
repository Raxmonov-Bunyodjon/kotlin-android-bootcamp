package StructuralPatterns4

// Shakar qo‘shadigan dekorator
class SugarDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {

    override fun cost() = super.cost() + 2

    override fun description() = super.description() + ", Shakar"
}