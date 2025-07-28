# 🚇 Metro Route Filter - Kotlin Console App

This is a simple Kotlin console application that simulates metro routes and allows the user to filter them by travel time.

## 📌 Features

- Define `Metro` class with attributes:
    - `departureStation` (Jo‘nash bekati)
    - `destinationStation` (Oxirgi bekat)
    - `travelTime` (Yo‘lda yurish vaqti)
    - `lineNumber` (Liniya raqami)
- Store metro routes in a `MetroManager` class using `mutableListOf`.
- Input maximum travel time and filter routes accordingly.
- Display only the routes that match the time criteria.

## 🛠️ Technologies Used

- Kotlin
- IntelliJ IDEA (Recommended IDE)
- Standard Kotlin I/O (`Scanner`, `readLine`, etc.)

## 🚀 How It Works

1. Five predefined metro routes are added.
2. The user is prompted to enter a maximum travel time (in minutes).
3. The application displays only the routes that are less than or equal to the specified time.

## 🧩 Sample Output

Maksimal yo‘lda yurish vaqtini kiriting (daqiqa): 13
Yo‘lda 13 daqiqadan kam yoki teng bo‘lgan metro yo‘nalishlari:
Metro(line=3, from='Yunusobod', to='Shahriston', time=12)
Metro(line=2, from='Do‘stlik', to='Qo‘yliq', time=10)
Metro(line=2, from='Hamid Olimjon', to='Mustaqillik Maydoni', time=8)



## 📂 Project Structure

Topshiriq5/
│
├── Metro.kt # Metro class
├── MetroManager.kt # Manages metro list and filtering
└── Main.kt # Main entry point



## 👨‍💻 Author

Bunyodjon Raxmonov 