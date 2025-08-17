fun main(args: Array<String>) {

    var normalCoffeeMachine = NormalCoffeeMachine()

    var enhancedCoffeeMachine = EnhancedCoffeeMachine(normalCoffeeMachine)

    enhancedCoffeeMachine.makeCoffeeWithMilk()
    enhancedCoffeeMachine.makeSmallCoffee()


    enhancedCoffeeMachine.makeCoffeeWithMilk()

}