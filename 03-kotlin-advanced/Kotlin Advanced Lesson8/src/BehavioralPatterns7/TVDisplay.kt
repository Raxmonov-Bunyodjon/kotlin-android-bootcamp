package BehavioralPatterns7

class TVDisplay: Observer {
    override fun update(temperature: Float) {
        println("📺 TV ekrani yangilandi: Harorat $temperature°C")
    }
}