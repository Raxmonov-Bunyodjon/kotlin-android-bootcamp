package BehavioralPatterns7

// Subject interfeysi
interface Subject {

    fun registerObserver(observer: Observer)

    fun removeObserver(observer: Observer)

    fun notifyObservers()
}