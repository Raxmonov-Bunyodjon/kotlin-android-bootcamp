# 3-Topshiriq: Fuqarolarga Pasport Berish Loyihasi

Bu loyiha Kotlin dasturlash tilida yozilgan bo‘lib, fuqarolarga pasport berish tartibini modellashtiradi. Loyihaning asosiy talabi — **pasport seriya raqami unikal bo‘lishi**, ya’ni bir xil seriya raqamli pasportlar takrorlanmasligi kerak.

## 📦 Loyihaning tuzilmasi

- `Passport.kt` — Pasport model klassi
- `PassportService.kt` — Interfeys
- `PassportServiceImpl.kt` — Pasport qo‘shish va ko‘rsatish logikasi
- `Main.kt` — Test holati

## 🔐 Unikal identifikatsiya

Pasportlar `HashSet` ichida saqlanadi. `Passport` klassida `equals()` va `hashCode()` metodlari faqat `passportNumberSerial` asosida yozilgan. Bu orqali seriya raqamning takrorlanmasligi ta'minlanadi.

## 🧪 Test

`Main.kt` faylida ikki pasport qo‘shiladi. Agar seriya raqam bir xil bo‘lsa, ikkinchi pasport tizimga qo‘shilmaydi.

## 🚀 Ishga tushirish

```bash
kotlinc *.kt -include-runtime -d passport.jar
java -jar passport.jar
📌 Muallif
Bunyodjon — 3-topshiriq yechimi