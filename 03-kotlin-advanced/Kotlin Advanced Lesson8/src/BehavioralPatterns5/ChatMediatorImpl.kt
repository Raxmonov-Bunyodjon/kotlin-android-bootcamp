package BehavioralPatterns5

// Mediator implementation
class ChatMediatorImpl: ChatMediator {
    private val users = mutableListOf<User>()

    override fun sendMessage(message: String, user: User) {
        for (u in users) {
            // Xabarni yuborayotgan odamdan tashqari hammasiga jo‘natish
            if (u != user) {
                u.receive(message)
            }
        }
    }

    override fun addUser(user: User) {
        users.add(user)
    }
}