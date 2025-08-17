class CommandProcessor {

    val queue = ArrayList<OrderCommand>()

    fun addToQueue(orderCommand: OrderCommand): CommandProcessor =
        apply {
            queue.add(orderCommand)
        }

    fun processCommands(): CommandProcessor =
        apply {
            queue.forEach { it.exucute() }
            queue.clear()
        }
}

interface OrderCommand {
    fun exucute()
}

class OrderAddCommand(val id: Long) : OrderCommand {
    override fun exucute() {
        println("Order add command  $id")
    }
}

class OrderPayCommand(val id: Long) : OrderCommand {
    override fun exucute() {
        println("Order pay command  $id")
    }
}