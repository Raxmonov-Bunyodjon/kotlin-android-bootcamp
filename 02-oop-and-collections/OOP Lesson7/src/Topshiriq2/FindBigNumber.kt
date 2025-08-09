package Topshiriq2

fun main(args: Array<String>) {

println(findBigNumber(22.0,11.0,222.0))
}

//3 ta sonni kattasini aniqlaydigan generic funkisya yarating.

fun <T: Comparable<T>> findBigNumber(number1: T, number2: T,number3: T): T? {

        when {
            number1 > number2 && number1 > number3 -> {
                return number1

            }
            number1 == number2 && number1 > number3 -> {
               return number1
            }
            number1 == number3 && number1 > number2 -> {
                return number1
            }
            number2 > number1 && number2 > number3 -> {
               return number2
            }
            number2 == number1 && number2 > number3 -> {
                return number2
            }
            number2 == number3 && number2 > number1 -> {
                return number2
            }
            number3 > number2 && number3 > number1 -> {
                return number3
            }
            number3 == number1 && number3 > number2 -> {
                return number3
            }
            number3 == number2 && number3 > number1 -> {
                return number3
            }
            else -> println("Barcha sonlar teng!")

        }
    return null
}

