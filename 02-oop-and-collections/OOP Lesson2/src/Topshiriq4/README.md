# 💳 Account Transfer App (Kotlin)

This is a simple Kotlin console application that models a basic bank account system. It supports account creation, credit, debit, and fund transfer between accounts.

## 📌 Features

- Create account with or without initial balance
- View account details
- Credit (deposit) money to account
- Debit (withdraw) money from account
- Transfer funds between two accounts with validation

## 🛠 Technologies

- Kotlin
- IntelliJ IDEA
- Object-Oriented Programming (OOP)
- Console-based interaction

## 🚀 Usage Example

```kotlin
val acc1 = Account("001", "Bunyodjon", 1000)
val acc2 = Account("002", "Asil", 500)

acc1.transferTo(acc2, 500)
println(acc1)
println(acc2)
📂 File Structure

Topshiriq4/
├── Account.kt
└── Main.kt
📸 Sample Output

Boshlang'ich holat:
Account(id='001', name='Bunyodjon', balance=1000)
Account(id='002', name='Asil', balance=500)

500 so'm Bunyodjondan Asilga o'tkazilmoqda...

Yakuniy holat:
Account(id='001', name='Bunyodjon', balance=500)
Account(id='002', name='Asil', balance=1000)