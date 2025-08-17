package BehavioralPatterns

interface Handler {

    fun setNext(handler: Handler): Handler

    fun handle(request: String): Boolean
}