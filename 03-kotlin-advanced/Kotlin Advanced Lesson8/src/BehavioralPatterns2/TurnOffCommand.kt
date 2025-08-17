package BehavioralPatterns2

// TV'ni o'chirish buyrug'i
class TurnOffCommand(private val tv: TV): Command {
    override fun execute() {
        tv.turnOff()
    }
}