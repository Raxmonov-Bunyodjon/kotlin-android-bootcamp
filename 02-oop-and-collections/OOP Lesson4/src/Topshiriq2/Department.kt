package Topshiriq2

class Department: DeptManageable {

    var name: String = ""
    var employeeList: MutableList<Employee> = mutableListOf()

    constructor(name: String, employeeList: MutableList<Employee>) {
        this.name = name
        this.employeeList = employeeList
    }

    override fun assignEmploee(e: Employee) {
        employeeList.add(e)
    }

    override fun listEmployee(): List<Employee> = employeeList

    override fun removeEmployee(e: Employee): Boolean {
        return employeeList.remove(e)
    }
}