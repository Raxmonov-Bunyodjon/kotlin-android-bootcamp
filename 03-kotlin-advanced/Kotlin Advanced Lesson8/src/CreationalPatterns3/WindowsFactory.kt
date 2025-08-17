package CreationalPatterns3

class WindowsFactory: GUIFactory {

    override fun createButton(): Button = WindowsButton()

    override fun createCheckbox(): Checkbox = WindowsCheckbox()

}