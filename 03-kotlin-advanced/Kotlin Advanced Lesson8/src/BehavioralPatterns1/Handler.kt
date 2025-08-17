package BehavioralPatterns1

interface Handler {

    fun setNext(handler: Handler): Handler

    fun handle(request: String): Boolean
}