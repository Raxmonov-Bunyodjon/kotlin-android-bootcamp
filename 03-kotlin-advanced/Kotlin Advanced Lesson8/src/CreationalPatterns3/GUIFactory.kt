package CreationalPatterns3

interface GUIFactory {
    fun createButton(): Button
    fun createCheckbox(): Checkbox
}