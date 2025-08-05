# Kotlin OOP - 2-Modul 5-Dars - Topshiriq 1

## 📌 Mavzu: Nested class

### 🎯 Topshiriq:
Nested class yarating va undan obyekt oling.

### 🧾 Vazifa haqida:
Men `User` nomli tashqi class yaratdim va uning ichida `Gamer` nomli nested (ichki) class joylashtirdim. Har bir `Gamer` futbolchining ismi, familiyasi va pozitsiyasini o‘zida saqlaydi.

### ✅ Amalga oshirildi:
- Nested class (`User.Gamer`) yaratildi.
- 9 ta futbolchidan iborat `1999-yillar FC` jamoasi tuzildi.
- Har bir futbolchi pozitsiyasiga qarab guruhlab chiqarildi.

### 🔧 Foydalanilgan texnologiyalar:
- Kotlin
- OOP (Object-Oriented Programming)
- Nested Class
- Method calling
- println formatlash

### 📂 Foydalanish:
```kotlin
var gamer1 = User.Gamer("Mamatqulov", "Jalol", "Goalkeeper")
println(gamer1.foodballer())
🖥️ Natija:

<<<<<<<Jamoa nomi: 1999-yillar FC >>>>>>>>>>
Darvozabon: 
Gamer about info: Firstaname: Mamatqulov, Lastname: Jalol, Position: Goalkeeper  
...