# 🧩 5-Topshiriq — Kotlin Collections

📌 **Maqsad:** Kotlin’da collection turlari (`List`, `Set`, `Map`) va ularning mutable versiyalari (`MutableList`, `MutableSet`, `MutableMap`) bilan ishlashni amalda ko‘rsatish.

---

## 📂 Loyihaning tarkibi
### 1. `PlayerDataService` interfeysi
- `footballClub()` — parametrlarni **List** ko‘rinishida saqlash
- `superLigaUFF()` — parametrlarni **MutableList** ko‘rinishida saqlash
- `dangerousGamesName()` — parametrlarni **MutableSet** ko‘rinishida saqlash

### 2. `PlayerDataServiceImpl` klassi
- Interfeys metodlarini override qilib, to‘plamlarni konsolga chiqaradi

### 3. Qo‘shimcha misollar
- `listOf` va `mutableListOf` bilan ishlash
- `setOf` va `mutableSetOf` bilan ishlash
- `mapOf` va `mutableMapOf` bilan ishlash
- `add`, `remove`, `clear`, `reversed` kabi metodlarni ishlatish

---

## ▶️ Ishga tushirish
1. **Clone** qilish:
   ```bash
   git clone https://github.com/<username>/<repository-name>.git
Android Studio yoki IntelliJ IDEA’da oching

main funksiyasini ishga tushiring

📸 Konsol natijalari
Misollar natijasida:

List — tartiblangan elementlar

MutableList — element qo‘shish, o‘chirish, o‘zgartirish

Set — unikal elementlar

