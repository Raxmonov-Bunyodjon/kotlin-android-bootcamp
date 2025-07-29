package Topshiriq1

import java.awt.Color

class Circle {
    private var radius: Double = 1.0
    private var color: String = "red"

    constructor()

    constructor(radius: Double) {
        this.radius = radius
    }

    constructor(radius: Double, color: String) {
        this.radius = radius
        this.color = color
    }

    fun getRadius(): Double {
        return radius
    }

    fun getColor(): String {
        return color
    }

    fun setRadius(radius: Double) {
        this.radius = radius
    }

    fun setColor(newColor: String) {
        color = newColor
    }

    override fun toString(): String {
        return "User(radius=$radius, color=$color)"
    }

    fun getArea(): Double {
        return Math.PI * radius * radius
    }}