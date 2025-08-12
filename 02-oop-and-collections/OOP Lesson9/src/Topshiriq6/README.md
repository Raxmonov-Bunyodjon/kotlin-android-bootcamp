# 🧩 6-Topshiriq — Set va List farqi (Kotlin)

## 📌 Topshiriq sharti
> "Set va List bu ikkala collectionlar o'rtasida qanday farqligini yozing. Yangi loyiha yaratib isbotlab bering."

## 💡 Qisqacha tushuncha
- **List** — elementlar tartibini saqlaydi va takrorlanuvchi qiymatlarni qabul qiladi.
- **Set** — faqat unikal qiymatlarni saqlaydi, takrorlarni avtomatik o‘chiradi, tartib kafolatlanmaydi.

## 🖥 Kod
```kotlin
fun main(args: Array<String>) {
    // List collection
    var student: MutableList<Any> = mutableListOf()
    var student1: MutableSet<Any> = mutableSetOf()

    student.add("Bunyod")
    student.add(2)
    student.add(2)
    student.add(3)
    student.add("Bunyod")
    student.add("Jalol")

    println("<<List farmatida chiqishi>>")
    println(student)

    // Set collection
    student1.add("Bunyod")
    student1.add(2)
    student1.add(2)
    student1.add(3)
    student1.add("Bunyod")
    student1.add("Jalol")

    println("<<Set farmatida chiqishi>>")
    println(student1)
}
📊 Natija

<<List farmatida chiqishi>>
[Bunyod, 2, 2, 3, Bunyod, Jalol]

<<Set farmatida chiqishi>>
[2, 3, Bunyod, Jalol]