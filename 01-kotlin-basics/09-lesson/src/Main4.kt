fun main(args: Array<String>) {

    validate(19)

}

fun validate(age: Int) {
    if (age < 18) {
        throw ArithmeticException()
    } else {
        println("Haydashga layoqatli")
    }
}