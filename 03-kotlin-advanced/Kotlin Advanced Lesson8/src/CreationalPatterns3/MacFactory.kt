package CreationalPatterns3

class MacFactory: GUIFactory {

    override fun createButton(): Button = MacButton()

    override fun createCheckbox(): Checkbox = MacCheckbox()
}