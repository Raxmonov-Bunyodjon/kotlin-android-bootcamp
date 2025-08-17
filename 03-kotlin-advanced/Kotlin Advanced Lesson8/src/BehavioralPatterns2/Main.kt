package BehavioralPatterns2

fun main(args: Array<String>) {

    val tv = TV()
    val turnOn = TurnOnCommand(tv)
    val turnOff = TurnOffCommand(tv)

    val remote = RemoteControl()

    remote.setCommand(turnOn)
    remote.pressButton() // 📺 TV yoqildi

    remote.setCommand(turnOff)
    remote.pressButton() // 📺 TV o'chirildi
}