package BehavioralPatterns7

fun main(args: Array<String>) {

    val weatherStation = WeatherStation()

    val phoneDisplay = PhoneDisplay()
    val tvDisplay = TVDisplay()

    // Observerlarni ro‘yxatga qo‘shish
    weatherStation.registerObserver(phoneDisplay)
    weatherStation.registerObserver(tvDisplay)

    // Haroratni o‘zgartirish
    weatherStation.setTemperature(25.5f)
    weatherStation.setTemperature(30.0f)

    // Bitta observerni olib tashlash
    weatherStation.removeObserver(tvDisplay)

    weatherStation.setTemperature(28.3f)

}