package BehavioralPatterns2

// Pult — buyruqni qabul qilib, bajaradi
class RemoteControl {
    private var command: Command? = null

    fun setCommand(command: Command) {
        this.command = command
    }

    fun pressButton() {
        command?.execute()
    }
}