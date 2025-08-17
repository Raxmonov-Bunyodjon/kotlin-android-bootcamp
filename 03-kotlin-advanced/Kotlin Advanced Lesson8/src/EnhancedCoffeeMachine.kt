class EnhancedCoffeeMachine(private val coffeeMachine: CoffeeMachine):CoffeeMachine by coffeeMachine {

    override fun makeLargeCoffee() {
        println("Enhanced: Make large coffee")
        coffeeMachine.makeLargeCoffee()
    }

    fun makeCoffeeWithMilk(){
        println("Enhanced: Make Coffee with milk")
        coffeeMachine.makeSmallCoffee()
        println("Enhanced: Adding milk")
    }
}

