package Topshiriq3

interface AttributeHolder {

    //Bu yerda tanasi bo'lmagan funksiyalar bor

    //Bu funksiya obyektdagi barcha atributlarni bir vaqtning o‘zida yangilash
    // uchun ishlatiladi. Parametr sifatida Map keladi, unda har bir kalit
    // (String) — atribut nomi, va qiymati (Any) — o‘sha atributga beriladigan qiymat.
    fun setAttributes(attrMap: Map<String, Any>)


    //Bu funksiya obyektning hozirgi barcha atributlarini xarita
    // (Map) ko‘rinishida qaytaradi.
    fun getAttributes(): Map<String, Any>
}