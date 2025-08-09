# 🧩 Kotlin Delegation — 4-Topshiriq

## 📌 Vazifa
Kotlin delegationga o'zingiz misol keltiring.

## 💡 Yechim tushuntirishi
Bu loyihada `ServiceCourseWork` nomli **interface** yaratilgan va unda ikki metod bor:
- `courseTopicInfo()` — kurs ishining mavzusi, qabul qiluvchi va muddati haqida ma'lumot beradi.
- `minCondition()` — kurs ishining sahifa soni va sahifa hajmi haqida ma'lumot beradi.

`ServiceCourseWorkImpl` klassi ushbu metodlarni implement qiladi.  
`ServiceDelegation` esa **Kotlin delegation** orqali barcha metodlarni `ServiceCourseWorkImpl` obyektiga uzatadi.

Bu orqali biz kodni takrorlamasdan, metodlarni boshqa obyektga **delegatsiya** qildik.

## 📂 Kod tuzilishi
Topshiriq4/
│
├── ServiceCourseWork.kt # Interface
├── ServiceCourseWorkImpl.kt # Interface'ni implement qiluvchi klass
├── ServiceDelegation.kt # Delegation klass
└── Main.kt # Loyihani ishga tushirish



## 🛠 Ishga tushirish
```bash
kotlinc Topshiriq4/*.kt -include-runtime -d delegation.jar
java -jar delegation.jar
📜 Natija

Kurs ishi mavzusi: Matritsa,
Qabul qiluvchini ismi: Olim Domila,
Qabul qilish yakuniy kuni: 25-08-2025-yil
Kurs ishiga ketadiga varoqlar soni: 30 varoq,
Kurs ishining varoqg'ining hajmi: A4 farmatda
📷 Ekran rasmi

👨‍💻 Muallif: Bunyodjon