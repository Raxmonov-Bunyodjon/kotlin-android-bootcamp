package Topshiriq1

import java.util.Scanner

class listClassServiceImpl : listClassService {

    var classListObject = arrayListOf<ClassList>()
    var scanner = Scanner(System.`in`)

    override fun addToList() {
        println("Sinf jurnaliga o'quvchini ismini kiriting:")
        var firstName = scanner.next()
        println("Sinf jurnaliga o'quvchini familyasini kiriting:")
        var lastName = scanner.next()
        println("O'qiyotgan fanini nomini kiriting:")
        var science = scanner.next()
        println("O'qiyotgan fanidan olgan bahosini kiriting:")
        var points = scanner.next()
        var classList = ClassList(firstName,lastName,science,points)
        classListObject.add(classList)
    }

    override fun editToList() {
        println("Qaysi o`rnidagi o`quvchini o'chirmoqchisiz:")
        for (i in classListObject.indices) {
            println("${i+1}.${classListObject[i]}")
        }

        var number = scanner.nextInt()
        scanner = Scanner(System.`in`)
        println("Yangi o'quvchini ismini sinf jurnaliga kiriting:")
        var newFirstName = scanner.nextLine()
        scanner = Scanner(System.`in`)
        println("Yangi o'quvchini familyasini sinf jurnaliga kiriting:")
        var newLastName = scanner.nextLine()
        scanner = Scanner(System.`in`)
        println("Yangi fani nomini kiriting o`qitilayorgan:")
        var newScience = scanner.nextLine()
        scanner = Scanner(System.`in`)
        println("Yangi faniga qo'yingan yangi bahoni kiriting:")
        var newPoints = scanner.nextLine()
        scanner = Scanner(System.`in`)

        classListObject[number - 1].firstName = newFirstName
        classListObject[number - 1].lastName = newLastName
        classListObject[number - 1].science = newScience
        classListObject[number - 1].points = newPoints
    }

    override fun removeToList() {
        println("Qaysi o`ridagi o`quvchibi o'chirish keeak")
        for (i in classListObject.indices) {
            println("${i + 1}.${classListObject[i]}")
        }

        var index = scanner.nextInt()
        classListObject.removeAt(index-1)
    }

    override fun searchToList() {
        println("Qidirilayotgan o`quvchini chiqaring:")
        var a = scanner.nextLine()
        for (i in classListObject) {
            if (i.firstName == a || i.lastName == a|| i.science ==a || i.points==a){
                println(i)
            }
        }
    }

    override fun showAllList() {
        println("Barcha maqolalar ro'yxati:")
        for (i in classListObject) {
            println(i)
        }
    }
}