package Topshiriq1

fun main(args: Array<String>) {

    var personsMap: MutableMap<Int, UserRegistration> = mutableMapOf()

    var person1 = UserRegistration(1, "Bunyodjon", 26, "Erkak", 112232, "Uzbeksiton")
    var person2 = UserRegistration(2, "Jalol", 26, "Erkak", 112232, "Uzbeksiton")

    personsMap[person1.id] = person1
    personsMap[person2.id] = person2

    println("Foydalanuvchilar ro'yxati!")
    for ((id,person) in personsMap) {
        println("ID: $id -> Ismi: ${person.name}, Yoshi: ${person.age}  Mamlakati: ${person.country}")
    }

    var foundPerson = personsMap[2]
    println(foundPerson?.name)

    personsMap.remove(2)

    println("Foydalanuvchilar ro'yxati!")
    for ((id,person) in personsMap) {
        println("ID: $id -> Ismi: ${person.name}, Yoshi: ${person.age}  Mamlakati: ${person.country}")
    }
}





