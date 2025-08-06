# 📚 Kotlin Library Management System

This is a simple Kotlin-based library management system demonstrating the use of:

- `class`, `data class`, `enum class`, `inner class`
- Object-oriented programming concepts
- Book borrowing and returning logic

## 📁 Features

- Add and remove books from the library
- Register readers
- Borrow and return books
- Enum classes for book status and category
- Inner class to manage staff members

## 🏛️ Classes Overview

- `Library`: Main class holding the collection of books and readers
- `Book`: Represents a book with title, author, category, and status
- `Reader`: A person who can borrow/return books
- `Staff`: Inner class of `Library`
- `BookStatus` & `BookCategory`: Enum classes

## 📌 Example Usage

```kotlin
val book1 = Book("Sherlock Holmes", "Arthur Conan Doyle", BookCategory.DETECTIVE, BookStatus.AVAILABLE)
val reader1 = Reader("John Doe", 1)

val library = Library("Central Library", "Main St", mutableListOf(book1), mutableListOf(reader1))

println(reader1.borrow(book1))
🚀 How to Run
Make sure Kotlin is set up on your system, then run from main.kt file.