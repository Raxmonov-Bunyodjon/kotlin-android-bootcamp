package Topshiriq2

class Employee : Person, Employable, Payable, PositionAssignable, Workable {

    private var position: String = ""
    private var salary: Double = 0.0

    constructor(
        firstName: String,
        lastName: String,
        middleName: String,
        birthYear: Int,
        gender: String,
        id: Int,
        position: String,
        salary: Double,
    ) : super(firstName, lastName, middleName, birthYear, gender, id) {
        this.position = position
        this.salary = salary
    }

    override fun hire(): Employee {
        return Employee(firstName, lastName, middleName, birthYear, gender, id, position, salary)
    }

    override fun resign(): String = "Employee ${getFullName()} has resigned from the position of $position."

    override fun getSalary(): Double = salary

    override fun setSalary(): Double {
        // Misol uchun, har oy 10% oshirish
        salary *= 1.10
        return salary
    }

    override fun assignPosition(position: String) {
        this.position = position
        println("New position assigned: $position")
    }

    override fun getPosition(): String = position

    override fun doWork() {
        println("${getFullName()} is working as $position.")
    }

    override fun reportTask(): String = "Employee $firstName has completed today's tasks."
}