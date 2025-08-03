package Topshiriq2

fun main(args: Array<String>) {


    val employee1 = Employee(
        firstName = "Ali",
        lastName = "Valiyev",
        middleName = "Olimovich",
        birthYear = 1995,
        gender = "Male",
        id = 1,
        position = "Android Developer",
        salary = 2500.0
    )
    val hiredEmployee = employee1.hire()

    // 1. Employee obyektlarini yaratish
    val emp1 = Employee(
        firstName = "Ali",
        lastName = "Karimov",
        middleName = "Olimovich",
        birthYear = 1995,
        gender = "Male",
        id = 1,
        position = "Android Developer",
        salary = 1200.0
    )

    val emp2 = Employee(
        firstName = "Laylo",
        lastName = "Ismoilova",
        middleName = "Saidovna",
        birthYear = 1997,
        gender = "Female",
        id = 2,
        position = "UI/UX Designer",
        salary = 1000.0
    )

    // 2. Department obyektini yaratish
    val department = Department(
        name = "IT Department",
        employeeList = mutableListOf(emp1, emp2) // boshlang‘ich ro‘yxat
    )

    // 3. Ro‘yxatdagi xodimlarni chiqarish
    println("=== Xodimlar ro‘yxati (${department.name}) ===")
    for (emp in department.listEmployee()) {
        println(emp.getFullName() + " - " + emp.getPosition())
    }

    // 4. Yangi xodim qo‘shish
    val emp3 = Employee(
        firstName = "Rustam",
        lastName = "Toirov",
        middleName = "Azizovich",
        birthYear = 1998,
        gender = "Male",
        id = 3,
        position = "Tester",
        salary = 900.0
    )

    department.assignEmploee(emp3)

    println("\n--- Yangi xodim qo‘shilgandan so‘ng ---")
    department.listEmployee().forEach {
        println("${it.getFullName()} - ${it.getPosition()}")
    }

    // 5. Xodimni o‘chirish
    department.removeEmployee(emp1)

    println("\n--- 1-xodim o‘chirilgandan keyin ---")
    department.listEmployee().forEach {
        println("${it.getFullName()} - ${it.getPosition()}")
    }
    println("Hired Employee1: ${hiredEmployee.firstName} ${hiredEmployee.lastName}, Position: ${hiredEmployee.getPosition()}, Salary: ${hiredEmployee.getSalary()}")
}