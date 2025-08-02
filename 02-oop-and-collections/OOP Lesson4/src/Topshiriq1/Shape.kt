package Topshiriq1

abstract class Shape {

    private var color: String = ""

    abstract fun area(): Double

    abstract override fun toString(): String

    open fun getColor(): String = "Yellow"
}