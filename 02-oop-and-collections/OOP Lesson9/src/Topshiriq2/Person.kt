package Topshiriq2

class Person {

    var name: String = ""
    var age: Int = 0
    var gender: String = ""
    var telNumber: String = ""

    constructor(name: String, age: Int, gender: String, telNumber: String) {
        this.name = name
        this.age = age
        this.gender = gender
        this.telNumber = telNumber
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age, gender='$gender', telNumber='$telNumber')"
    }
}