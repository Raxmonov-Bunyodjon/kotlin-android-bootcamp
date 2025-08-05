package Topshiriq1

fun main(args: Array<String>) {

    var gamer1 = User.Gamer("Mamatqulov", "Jalol", "Goalkeeper")
    var gamer2 = User.Gamer("Qurbonov", "Shaxzod", "Back left")
    var gamer3 = User.Gamer("Qurbonov", "Jamol", "Back right")
    var gamer4 = User.Gamer("Raxmonov", "Murodjon", "Back middle")
    var gamer5 = User.Gamer("Jumanov", "Dostonbek", "Bakc middle")
    var gamer6 = User.Gamer("Davronov", "Dilmorod", "Half back")
    var gamer7 = User.Gamer("Baratov", "Donyor", "Half back")
    var gamer8 = User.Gamer("Abdukarimov", "Botirbek", "Half back")
    var gamer9 = User.Gamer("Bunyodjon", "Raxmonov", "Attacker")


    println("<<<<<<<Jamoa nomi: 1999-yillar FC >>>>>>>>>>")

    println("Darvozabon: \n${gamer1.foodballer()}\nHimoyachilar: \n${gamer2.foodballer()},  \n${gamer3.foodballer()},  \n${gamer4.foodballer()}, \n${gamer5.foodballer()}\nYarim himoyachilar: \n${gamer6.foodballer()},    \n${gamer7.foodballer()},    \n${gamer8.foodballer()}\nHujumchi: \n${gamer9.foodballer()}  ")
}