package Topshiriq3

class Staff : Person {
    private var school: String = ""
    private var pay: Double = 1.0

    constructor() : super()

    constructor(school: String, pay: Double) : super() {
        this.school = school
        this.pay = pay
    }

    constructor(name: String, address: String, school: String, pay: Double) : super(name, address) {
        this.school = school
        this.pay = pay
    }

    fun getSchool(): String = school
    fun setSchool(school: String) {
        this.school = school
    }

    fun getPay(): Double = pay
    fun setPay(pay: Double) {
        this.pay = pay
    }

    override fun toString(): String {
        return "Staff(Person(name='${getName()}, address:'${getAddress()}'), school='$school', pay=$pay)"
    }
}