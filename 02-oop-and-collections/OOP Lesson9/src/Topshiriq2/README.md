# Topshiriq 2 — Kotlin SetOf with Custom Class

This project demonstrates how to use Kotlin's `setOf` with a custom class (`Person`). It stores a group of unique people and prints their details. The goal is to show how Kotlin handles object uniqueness in sets.

## 📦 Technologies Used
- Kotlin
- IntelliJ IDEA / Android Studio
- GitHub for version control
- Telegram for sharing updates

## 🧠 What It Does
- Defines a `Person` class with name, age, gender, and phone number.
- Creates a `setOf` with multiple `Person` instances.
- Prints the set to console, showing how duplicates are handled.

## 📂 Code Example

```kotlin
fun main(args: Array<String>) {
    val people = setOf(
        Person("Bunyodjon", 26, "Mane", "+998997235955"),
        Person("Murodjon", 25, "Mane", "+998911027276"),
        Person("Jaloliddin", 26, "Mane", "+998990400798")
    )
    println(people)
}
kotlin
class Person(
    val name: String,
    val age: Int,
    val gender: String,
    val telNumber: String
) {
    override fun toString(): String {
        return "Person(name='$name', age=$age, gender='$gender', telNumber='$telNumber')"
    }
}
🎥 Stream Format
This project was recorded using OBS Studio and published on YouTube in stream format.



👤 Author
Created by [Bunyodjon]