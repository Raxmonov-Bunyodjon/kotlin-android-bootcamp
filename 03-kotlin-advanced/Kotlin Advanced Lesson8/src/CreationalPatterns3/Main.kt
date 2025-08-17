package CreationalPatterns3

fun main(args: Array<String>) {

    val winApp = Application(WindowsFactory())
    println("---- Windows UI ----")
    winApp.renderUI()

    // Mac foydalanuvchisi
    val macApp = Application(MacFactory())
    println("\n---- Mac UI ----")
    macApp.renderUI()
}