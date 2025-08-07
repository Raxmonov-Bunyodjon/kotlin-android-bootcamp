fun main(args: Array<String>) {

    var person = object :Person(){
        override fun run() {
            println("Running...")
        }
    }
    person.eat()
    person.talk()
    person.run()

}