# 🟡 Kotlin Abstract Class: Shape, Circle, and Rectangle

This project demonstrates the usage of **abstract classes** and **method overriding** in Kotlin using simple geometrical shapes: `Shape`, `Circle`, and `Rectangle`.

## 📌 Overview

- `Shape` is an abstract class that contains:
    - `abstract fun area(): Double`
    - `abstract override fun toString(): String`
    - `open fun getColor(): String = "Yellow"`
- `Circle` and `Rectangle` inherit from `Shape` and override the abstract methods.

## 📁 Project Structure

Topshiriq1/
├── Shape.kt // Abstract class with base behavior
├── Circle.kt // Circle shape implementation
├── Rectangle.kt // Rectangle shape implementation
└── Main.kt // Main function to run the example



## 🔍 Sample Output

Yuzi:
Aylanani: 28.274333882308138,
To'rtburchakni: 12.0
Aylana:
Aylanani ma'lumot: Area: 28.274333882308138, Radius: 3.0. Color: Yellow,
To'rtburchakni ma'lumot: Rectangle(length=3.0, width=4.0), Area: 12.0, Color: Yellow



## 🧠 What I Learned

- How to use **abstract classes** in Kotlin.
- How to override abstract and `toString()` methods.
- The role of `open`, `override`, and access modifiers like `private`.

## 🕐 Time Spent

⏱️ Completed in **1 hour and 15 minutes** with live coding (stream).

## 🚀 How to Run

Make sure you have Kotlin installed and run the following command in terminal:

```bash
kotlinc *.kt -include-runtime -d shapes.jar && java -jar shapes.jar