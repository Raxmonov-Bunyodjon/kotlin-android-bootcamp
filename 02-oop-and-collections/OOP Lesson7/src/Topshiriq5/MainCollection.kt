package Topshiriq5

fun main(args: Array<String>) {

    //ListOf Collection
    var fruits = listOf<String>("Apple","Banana","Nok","Behi","Uzum")
    println(fruits.reversed())

    var numbers = listOf<Int>(1,2,2,2,3,4,5,5,5,6,6,7)
    println(numbers)
    println(numbers.reversed())

    //MutableList Collection
    var cars = mutableListOf<String>("Nexia 3", "Tiko", "Damas", "Cobalt midnight", "Nexia 2")
    println(cars)
    cars.add(2, "Volga")
    println(cars)
    println(cars.reversed())

    cars.remove("Volga")
    println(cars)
    cars.clear()
    println(cars)

    //Set Collection
    var number = setOf<Int>(1,2,2,2,3,4,5,5,5,6,6,7)

    println(number)

    //MutableSet bilan
    var names = mutableSetOf<String>("Bunyod", "Jasur", "Jalol", "Sardor", "Doston", "Bunyod", "Sardor", "Jalol")
    println(names)
    names.add("Ali")
    names.reversed()
    println(names)

    //Map Collection

    val countryCode = mapOf(
        "Uz" to "O'zbekiston",
        "Ru" to "Rossiya",
        "UK" to "Buyuk Britaniya"
    )

    println(countryCode["Uz"])

    //Map Collection
    val length = mutableMapOf("Bunyod" to 1.82, "Murod" to 1.82)
    length["Jalol"] = 1.74
    println(length)
    length.remove("Murod")
    println(length)
}