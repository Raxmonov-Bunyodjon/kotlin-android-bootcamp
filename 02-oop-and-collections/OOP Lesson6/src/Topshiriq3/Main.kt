package Topshiriq3

fun main(args: Array<String>) {

    var game1 = Games.getInfo()
    var game2 = Games.setInfo("Pes", "Playstayion 7", 2025, 3000000.0)
    game1.showInfo()
    println("<<<<<<<<<<<<<<<<<<___________________>>>>>>>>>>>>>>>>>>>>")
    game2.showInfo()

    println("<<<<<<<<Setub qismi Object>>>>>>>>>")
    var b1 = Games.Setub.setInfo("FIFA", 200000.0, 32)
    b1 = Games.Setub.showInfo()
    println(b1)
    Games.Setub.setInfo("Pes", 3000000.0, 16)
    Games.Setub.showInfo()
    Games.Setub.clear()
    Games.Setub.showInfo()

}