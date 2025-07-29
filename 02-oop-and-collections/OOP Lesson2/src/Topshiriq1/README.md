# Circle Class in Kotlin

This project demonstrates how to define and use a simple `Circle` class in Kotlin.  
It includes constructors, getter and setter methods, area calculation, and a custom `toString()` method.

## 📌 Features

- ✅ Multiple constructors
- ✅ Getter and setter methods
- ✅ Circle area calculation
- ✅ Custom `toString()` method

## 📦 Class Structure

```kotlin
class Circle {
    private var radius: Double = 1.0
    private var color: String = "red"

    constructor()
    constructor(radius: Double)
    constructor(radius: Double, color: String)

    fun getRadius(): Double
    fun getColor(): String
    fun setRadius(radius: Double)
    fun setColor(newColor: String)
    fun getArea(): Double
    override fun toString(): String
}
🚀 Output Example
mathematica

Radius (avvalgi): 4.0  
Color (avvalgi): yellow  
Radius (yangi): 5.0  
Color (yangi): Green  
Area: 78.53981633974483  
User(radius=5.0, color=Green)
🛠 How to Run
Clone the repository.

Open with IntelliJ IDEA or any Kotlin-compatible IDE.

Run the main() function inside Main.kt.

📁 Folder Structure

Topshiriq1/
├── Circle.kt
├── Main.kt
└── README.md
🧑‍💻 Author
Created by Bunyodjon Raxmonov as part of Kotlin OOP practice.