package Topshiriq3

class Employee {
    var id: Int
    var firstName: String
    var lastName: String
    var salary: Int

    constructor(id: Int, firstName: String, lastName: String, salary: Int) {
        this.id = id
        this.firstName = firstName
        this.lastName = lastName
        this.salary = salary
    }

    fun getName(): Pair<String, String> {
        return Pair(firstName, lastName)
    }

    fun getAnnualSalary(): Int {
        return salary * 12
    }

    fun raiseSalary(percent: Int): Int {
        return salary + (salary * percent / 100)
    }

    override fun toString(): String {
        return "Employee(id=$id, firstName='$firstName', lastName='$lastName', salary=$salary)"
    }

}





