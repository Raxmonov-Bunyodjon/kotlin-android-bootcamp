package Topshiriq1

fun main(args: Array<String>) {


    val person1 = GenericUser("Bunyod", 26, "Mane", "5-08-1999", "Uzbekistan")
    val person2 = GenericUser("Jalol", 26.0, "Mane", 4071999, "Uzbekistan")
    val person3 = GenericUser("Dilmurod", 26.0f, "Mane", 7051999.0, "Uzbekistan")

    person1.AboutMe()
    person2.AboutMe()
    person3.AboutMe()
}
