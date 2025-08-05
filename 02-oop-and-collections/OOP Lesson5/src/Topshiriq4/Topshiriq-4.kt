package Topshiriq4
fun main(args: Array<String>) {

    val streetInfo1 = Neighborhood(
        district =  "Xovos tumani",
        neighborhoodName = "Obod turmush",
        streetName = "Yoshlik ko'chasi",
        shopsNumber = 2,
        maneNumbers = 90,
        womenNumbers = 85,
        houseCount = 35,
        hasSchool = true,
        hasClinic = true,
        hasPlayground = false,
        isAsphalted = true
    )

    val streetInfo2 = Neighborhood(
        district =  "Xovos tumani",
        neighborhoodName = "Obod turmush",
        streetName = "Qanoat ko'chasi",
        shopsNumber = 1,
        maneNumbers = 75,
        womenNumbers = 69,
        houseCount = 32,
        hasSchool = false,
        hasClinic = false,
        hasPlayground = true,
        isAsphalted = false
    )

    val streetInfo3 = streetInfo2.copy(streetName = "Chorvador", houseCount = 80, maneNumbers = 220, womenNumbers = 210,)

    println("<<<<<<KO'CHALARNING HAQIDA MA'LUMOT>>>>>>")
    println("1-Kocha haqida ma'lumot: ${ streetInfo1.toString() }")
    println("1-Kocha haqida ma'lumot: ${ streetInfo2.toString() }")
    println("1-Kocha haqida ma'lumot: ${ streetInfo3.toString() }")
    println("<<<<<<KO'CHALARNING AHOLI SONI>>>>>>")
    println("1-Kocha haqida: ${ streetInfo1.totalPeople() }")
    println("2-Kocha haqida: ${ streetInfo2.totalPeople() }")
    println("3-Kocha haqida: ${ streetInfo3.totalPeople() }")
}