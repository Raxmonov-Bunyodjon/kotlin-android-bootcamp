package CreationalPatterns1

fun main(args: Array<String>) {

    // 1-chi joyda log yozamiz
    Logger.log("Application started")
    Logger.log("User clicked button")

    // 2-chi joyda ham xuddi shu Logger obyektidan foydalanamiz
    Logger.log("User logged in")
    Logger.log("Error: Invalid password")

    // Barcha loglarni ko‘rsatamiz
    Logger.showLogs()

}