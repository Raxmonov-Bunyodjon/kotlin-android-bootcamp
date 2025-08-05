fun main(args: Array<String>) {

    val user1 = User("Bunyod", 25, "Mane")

//    println(user1.name)
//    println(user1.age)
    println(user1.toString())

    val user2 = user1.copy()

//    println(user2.name)
//    println(user2.age)
    println(user2.toString())

    val user3 = user1.copy(name= "Akbar")

    println(user1.hashCode())
    println(user2.hashCode())
    println(user3.hashCode())

    println(user1 == user2)
    println(user1 == user3)
}