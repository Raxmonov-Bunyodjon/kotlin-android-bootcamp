package Topshiriq3

fun main(args: Array<String>) {

    var worker = Employee(1,"Bunyodjon","Raxmonov",1000000)

    // Faqat qiymat olish:
    println("ID (avvalgi): ${worker.id}")
    println("FirstName (avvalgi): ${worker.firstName}")
    println("LastName (avvalgi): ${worker.lastName}")
    println("Salary (avvalgi): ${worker.salary}")
    println("Salary yearly (avvalgi): ${worker.getAnnualSalary()}")

    // Oylik o‘zgartirish:
    worker.salary = 2_000_000
    println("O'zgartirilayotgan oylik:  ${worker.salary}")

    //Oylikni foizga ko'paytirish
    println("10% ga oshirilgan oylik: ${worker.raiseSalary(10)}")

    // Yangilangan Oylik:
    println("Oylik (yangi): ${worker.salary}")
    println("Yillik oylik (yangi): ${worker.getAnnualSalary()}")
    // toString() chaqirish
    println(worker.toString())

}