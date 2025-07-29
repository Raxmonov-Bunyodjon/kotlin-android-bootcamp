# 🧑‍💼 Employee Class – Kotlin OOP

This Kotlin project defines an `Employee` class that models a basic employee record, including salary operations and personal info.

## 📌 Features
- Store employee ID, first name, last name, and salary.
- Get full name as a `Pair`.
- Calculate annual salary.
- Raise salary based on a given percentage.
- Pretty print using `toString()`.

## 🧪 Example Usage

```kotlin
val employee = Employee(1, "Bunyodjon", "Raxmonov", 1_000_000)
println(employee.getAnnualSalary()) // 12_000_000
println(employee.raiseSalary(10))   // 1_100_000
📦 Output Sample


ID (avvalgi): 1
FirstName (avvalgi): Bunyodjon
LastName (avvalgi): Raxmonov
Salary (avvalgi): 1000000
Salary yearly (avvalgi): 12000000
O'zgartirilayotgan oylik:  2000000
10% ga oshirilgan oylik: 2200000
Oylik (yangi): 2000000
Yillik oylik (yangi): 24000000
Employee(id=1, firstName='Bunyodjon', lastName='Raxmonov', salary=2000000)
🚀 Technologies
Kotlin

Object-Oriented Programming (OOP)

IntelliJ IDEA

📁 File Structure

Topshiriq3/
│
├── Employee.kt       → Employee class definition
└── Main.kt           → Demonstration of Employee functionality
🧠 Author
Raxmonov Bunyodjon

📧 Email: bunyodjonraxmonov22@gmail.com
📱 Telegram: @RaxmonovBunyodjon