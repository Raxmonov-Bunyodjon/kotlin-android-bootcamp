class Child: User {

    var age: Int = 0

    override fun showUser() {
        println("Child")
    }

    constructor(age: Int) : super() {
        this.age = age
    }

    //ota class -> super class
    //bola class -> sub class



    constructor(userName: String, password: String, age: Int) : super(userName, password) {
        this.age = age
    }


}