# 🧩 6-Topshiriq — Kotlin Generics: ReadOnly, WriteOnly va ReadWrite List

📌 Ushbu loyiha Kotlin’da **Generics** va **kovarians (`out`) / kontravarians (`in`)** tushunchalarini amaliy ko‘rinishda ko‘rsatadi.  
💡 Maqsad: Ma’lumotlarni **faqat o‘qish**, **faqat yozish** yoki **o‘qish/yozish** imkoniyatlariga ega ro‘yxatlarni yaratish.

---

## 📂 Tuzilishi
Loyiha uchta sinfdan iborat:

### 1. `ReadOnlyList<out T>`
- Faqat **o‘qish** imkonini beradi.
- Funksiyalar:
    - `get(index)`
    - `findFirst(predicate)`
    - `findAll(predicate)`

### 2. `WriteOnlyList<in T>`
- Faqat **yozish** imkonini beradi.
- Funksiyalar:
    - `add(item)`
    - `add(index, item)`
    - `addAll(vararg items)`

### 3. `ReadWriteList<T>`
- **O‘qish** ham, **yozish** ham mumkin.
- Funksiyalar:
    - `add(item)`
    - `add(index, item)`
    - `addAll(ReadWriteList)`
    - `get(index)`
    - `findFirst(predicate)`
    - `findAll(predicate)`

---

## ▶️ Ishga tushirish
```bash
kotlinc *.kt -include-runtime -d app.jar
java -jar app.jar
📌 Namuna natija:

Barcha elementlar: [Real Madrid, Barcelona, PSG]
Birinchi 'B' bilan boshlanadigan: Barcelona
B bilan boshlanadiganlar: [Barcelona]
ReadOnly barcha: [Bayern, Chelsea, Juventus]
J bilan boshlanadiganlar: [Juventus]
WriteOnly ichidagi ma'lumot (test uchun): [10, 20, 30, 40, 50]