package BehavioralPatterns7

class WeatherStation: Subject {
    private val observers = mutableListOf<Observer>()
    private var temperature: Float = 0.0f

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(temperature)
        }
    }

    // Haroratni yangilash
    fun setTemperature(temp: Float) {
        println("🌡 Yangi harorat: $temp°C")
        this.temperature = temp
        notifyObservers()
    }

}