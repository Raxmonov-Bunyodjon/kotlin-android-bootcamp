package Topshiriq6

fun main(args: Array<String>) {

    //List collection
    var student: MutableList<Any> = mutableListOf()
    var student1: MutableSet<Any> = mutableSetOf()
    student.add("Bunyod")
    student.add(2)
    student.add(2)
    student.add(3)
    student.add("Bunyod")
    student.add("Jalol")

    println("<<List farmatida chiqishi>>")
    println(student)

//Set collection
    student1.add("Bunyod")
    student1.add(2)
    student1.add(2)
    student1.add(3)
    student1.add("Bunyod")
    student1.add("Jalol")

    println("<<Set farmatida chiqishi>>")
    println(student1)
}