package Topshiriq1

fun main(args: Array<String>) {

    Relationship.setUser("Bunyod", "Erkak", 22)
    Relationship.showInfo()

    println(Relationship)  // Relationship(name='Bunyod', gender='Erkak', age=22)

    Relationship.clear()
    Relationship.showInfo()
}