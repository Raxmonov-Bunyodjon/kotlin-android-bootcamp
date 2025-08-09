# 🚗 Car Generic Class – Kotlin

Bu loyiha Kotlin tilida yozilgan bo‘lib, unda **generic class** yordamida avtomobil ma’lumotlarini saqlash va ko‘rsatish imkoniyati yaratilgan.

## 📌 Tavsif
`Car` nomli klass **7 ta generic tip** (`T, N, F, C, S, Y, P`) qabul qiladi. Bu orqali turli tipdagi qiymatlarni bitta klass yordamida ishlatish mumkin.

## 🔹 Koddan parcha
```kotlin
class Car<T, N, F, C, S, Y, P>(
    var brand: T,
    var name: N,
    var fuelType: F,
    var color: C,
    var status: S,
    var yearOfProduction: Y,
    var priceCar: P
) {
    fun showInfo() {
        println("Moshinani brandi: $brand")
        println("Moshinani nomi: $name")
        println("Moshinani yoqilg'i turi: $fuelType")
        println("Moshinani rangi: $color")
        println("Moshinani holati: $status")
        println("Moshinani ishlab chiqarilgan yili: $yearOfProduction")
        println("Moshinani narxi: $priceCar")
    }
}
📊 Natija

Moshinani brandi: true
Moshinani nomi: Toyota Jim
Moshinani yoqilg'i turi: All fuel
Moshinani rangi: Yellow
Moshinani holati: New car
Moshinani ishlab chiqarilgan yili: 2025
Moshinani narxi: 220000
🚀 Ishga tushirish

kotlinc Car.kt -include-runtime -d car.jar
java -jar car.jar
✍ Muallif: Bunyodjon