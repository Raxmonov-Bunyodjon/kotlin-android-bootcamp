package BehavioralPatterns5

fun main(args: Array<String>) {

    val mediator = ChatMediatorImpl()

    val user1 = ChatUser(mediator, "Ali")
    val user2 = ChatUser(mediator, "Vali")
    val user3 = ChatUser(mediator, "Gulnoza")

    mediator.addUser(user1)
    mediator.addUser(user2)
    mediator.addUser(user3)

    user1.send("Salom hammaga!")
    user3.send("Salom Ali!")

}