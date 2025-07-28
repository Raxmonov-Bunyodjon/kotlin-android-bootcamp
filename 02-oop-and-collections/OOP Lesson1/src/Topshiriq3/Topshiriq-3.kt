package Topshiriq3

import java.util.Scanner

//Quyidagi atributlari bor bo’lgan Worker nomli class yarating:  familiya,
// ismi, yoshi, lavozimi, ishga kirgan yili. Yoshi berilgan sondan kata bo’lgan
// ishchilarni ekranga chiqaring.
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var company = Company()

    var workers = listOf(
        Worker("Mamatqulov", "Jalol", 26, "Shef oshpaz", 2022),
        Worker("Davronov", "Dilmurod", 20, "Axrana", 2021),
        Worker("Baratov", "Donyor", 16, "Sotuvchi", 2022),
        Worker("Raxmonov", "Murodjon", 25, "Broker", 2022),
        Worker("Qurbonov", "Jamol", 17, "Hunarmand", 2022)
    )

    for (worker in workers){
        company.addWorker(worker)
    }

    print("Yoshizni kiriting:")
    var inputAge = scanner.nextInt()


    var result = company.findWorkersOlderThan(inputAge)

    if (result.isNotEmpty()){
        println("Yoshingizdan katta ishchilar:")
        result.forEach {
            println("Ismi: ${it.firstName}, Familyasi: ${it.lastName}, Yoshi: ${it.age}")
            println("Lavozimi: ${it.position}, Ish boshlagan yili: ${it.workerStartYear}")
            println("--------------")
        }
    }else {
        println("Bunday yoshdan katta ishchi topilmadi.")
    }
}