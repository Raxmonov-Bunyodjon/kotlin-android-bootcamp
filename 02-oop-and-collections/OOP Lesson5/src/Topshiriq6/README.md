# 🎓 University Management System

A simple Kotlin console-based system that demonstrates the usage of:

- ✅ Sealed Classes
- ✅ Object declaration
- ✅ Data classes
- ✅ Inheritance and when expression

## 📌 About the Project

This project represents different user roles inside a university system: `Student`, `Teacher`, and `Admin`.

We use `sealed class` to restrict the type hierarchy and allow exhaustive `when` expression handling.

## 📁 Features

- Represent different university members
- Use of sealed classes and objects
- Smart `when` control flow
- Clear console output for each user type

## 🛠️ Technologies Used

- Kotlin

## 💡 Code Sample

```kotlin
sealed class Person {
    abstract val id: Int
    abstract val name: String

    data class Student(override val id: Int, override val name: String, val group: String): Person()
    data class Teacher(override val id: Int, override val name: String, val subject: String): Person()
    object Admin: Person() {
        override val id = 0
        override val name = "Admin"
    }
}

fun showPersonInfo(person: Person) {
    when(person) {
        is Person.Student -> println("👨‍🎓 Student: ${person.name}, Group: ${person.group}")
        is Person.Teacher -> println("👨‍🏫 Teacher: ${person.name}, Subject: ${person.subject}")
        is Person.Admin -> println("🛡️ Admin access: ${person.name}")
    }
}