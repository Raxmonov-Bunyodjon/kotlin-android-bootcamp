fun main(args: Array<String>) {

    var a = GenericsExample<String>(input = "FIFA")
    var b = GenericsExample<Int>(input = 17)


    println(a)
    println(b)

    var c = ParameterClass<String>("Kotlin")

    println(c.getValue())

    c.setValue("OOP and Android")
    println(c.getValue())

}