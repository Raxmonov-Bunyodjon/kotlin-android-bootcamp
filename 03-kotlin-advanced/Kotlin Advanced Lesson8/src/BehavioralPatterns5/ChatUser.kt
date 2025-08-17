package BehavioralPatterns5

class ChatUser(mediator: ChatMediator, name: String):User(mediator,name) {
    override fun send(message: String) {
        println("$name xabar yubordi: $message")
        mediator.sendMessage(message, this)
    }

    override fun receive(message: String) {
        println("$name xabar oldi: $message")
    }

}