package BehavioralPatterns7

class PhoneDisplay: Observer {
    override fun update(temperature: Float) {
        println("📱 Telefon ekrani yangilandi: Harorat $temperature°C")
    }
}