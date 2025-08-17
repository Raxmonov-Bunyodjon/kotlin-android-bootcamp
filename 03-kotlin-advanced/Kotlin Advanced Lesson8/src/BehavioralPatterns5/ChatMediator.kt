package BehavioralPatterns5

// Mediator interfeysi
interface ChatMediator {
    fun sendMessage(message: String, user: User)
    fun addUser(user: User)
}