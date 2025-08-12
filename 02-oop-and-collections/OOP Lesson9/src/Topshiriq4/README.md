✅ 4-Topshiriq: Ro‘yxatdan o‘tish tizimi — ToDo ro‘yxati

Bu loyiha Kotlin tilida yozilgan ro‘yxatdan o‘tish tizimini ifodalaydi. Email unikal bo‘lishi `HashSet` orqali ta'minlanadi.

## 📁 Tuzilishi

- `User.kt` — Foydalanuvchi modeli
- `RegistrationService.kt` — Interfeys
- `RegistrationServiceImpl.kt` — Emailni tekshiruvchi servis
- `Main.kt` — Test holatlari

## 🔐 Emailni tekshirish

- Email formati `Regex` orqali tekshiriladi
- Takrorlangan email holatida ❗ xatolik chiqariladi
- Yangi email bo‘lsa ✅ ro‘yxatdan o‘tkaziladi

## 🧪 Test holatlari

- 2 ta foydalanuvchi muvaffaqiyatli ro‘yxatdan o‘tadi
- 1 ta foydalanuvchi — takrorlangan email bilan — xatolik oladi
- `showAllUsers()` orqali ro‘yxat ko‘rsatiladi

## 🎥 Video yechim

Stream orqali yechdim — video tez orada yuklanadi...

## 📦 Ishga tushirish

```bash
kotlinc *.kt -include-runtime -d RegistrationSystem.jar
java -jar RegistrationSystem.jar