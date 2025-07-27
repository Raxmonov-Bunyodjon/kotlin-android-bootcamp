fun main() {

    var  lamp1 = Lamp()
    println(lamp1.isOn) //lampa o'chiq
    lamp1.turnOn()      //lampa yoqildi
    println(lamp1.isOn) //lampa yoniq
    lamp1.turnOff()     //lampa o'chirildi
    println(lamp1.isOn) //lampa o'chiq

}