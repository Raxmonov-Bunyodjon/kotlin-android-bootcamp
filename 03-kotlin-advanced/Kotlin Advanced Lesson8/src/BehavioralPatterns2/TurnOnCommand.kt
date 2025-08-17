package BehavioralPatterns2

// TV'ni yoqish buyrug'i
class TurnOnCommand(private val tv: TV): Command {
    override fun execute() {
        tv.turnOn()
    }
}