package BehavioralPatterns1

abstract class AbstractHandler : Handler {
    private var nextHandler: Handler? = null

    override fun setNext(handler: Handler): Handler {
        nextHandler = handler
        return handler
    }

    override fun handle(request: String): Boolean {
        return nextHandler?.handle(request) ?: true
    }
}
