package CreationalPatterns3

class Application(private val factory: GUIFactory) {

    private val button: Button = factory.createButton()
    private val checkbox: Checkbox = factory.createCheckbox()

    fun renderUI() {
        button.render()
        checkbox.render()
    }
}