package Topshiriq3

class SchoolRegistration {

    var firstName: String = ""
    var lastName: String = ""
    var middleName: String = ""
    var age: Int = 1
    var identityDocument: String = ""
    var telNumber: String = ""
    var picture3X4: String = ""
    var medicalExaminationDocument = ""
    var elementaryClass: String = ""
    var middleClass: String = ""
    var highClass: String = ""

    constructor(
        firstName: String,
        lastName: String,
        middleName: String,
        age: Int,
        identityDocument: String,
        telNumber: String,
        picture3X4: String,
        medicalExaminationDocument: String,
        elementaryClass: String,
        middleClass: String,
        highClass: String,
    ) {
        this.firstName = firstName
        this.lastName = lastName
        this.middleName = middleName
        this.age = age
        this.identityDocument = identityDocument
        this.telNumber = telNumber
        this.picture3X4 = picture3X4
        this.medicalExaminationDocument = medicalExaminationDocument
        this.elementaryClass = elementaryClass
        this.middleClass = middleClass
        this.highClass = highClass
    }


    fun schoolAdmission(age: Int): String {
        return when (age) {
            in 0..6 -> "Siz hali 7-yoshga kirmagansiz, shuning uchun qonunan qabul qilib bo'lmaydi."
            in 7..11 -> "Sizni boshlang'ich sinfga qabul qilish mumkin: $elementaryClass-sinflar."
            in 12..13 -> "Sizni o'rta sinflarga qabul qilish mumkin: $middleClass-sinflar."
            in 14..16 -> "Sizni yuqori sinflarga qabul qilish mumkin: $highClass-sinflar."
            in 17..100 -> "Katta ekan yoshingiz. Siz maktabga qabul qilinmaysiz."
            else -> "Noto'g'ri yosh kiritildi."
        }
    }

    override fun toString(): String {
        return "SchoolRegistration(firstName='$firstName', lastName='$lastName', middleName='$middleName', age=$age, identityDocument='$identityDocument', telNumber='$telNumber', picture3X4='$picture3X4', medicalExaminationDocument='$medicalExaminationDocument', elementaryClass='$elementaryClass', middleClass='$middleClass', highClass='$highClass')"
    }

    inner class GetLoginParol {

        var login: String = ""
        var parol: String = ""

        constructor(login: String, parol: String) {
            this.login = login
            this.parol = parol
        }


        fun emaktab(age: Int): String {
            return when (age) {
                in 0..6 -> "Tizimda topilmadi!"
                in 7..11 -> "Login parol berildi"
                in 12..13 -> "Login parol berildi"
                in 14..16 -> "Login parol berildi"
                in 17..100 -> "Tizimda topilmadi"
                else -> "Noto'g'ri yosh kiritildi."
            }
        }

        override fun toString(): String {
            return "GetLoginParol(login='$login', parol='$parol')"
        }
    }

    class Bmi {

        var weight: Double = 0.0
        var bodylength: Double = 0.0

        constructor(weight: Double, bodylength: Double) {
            this.weight = weight
            this.bodylength = bodylength
        }

        fun findBmi(): String = "Bu o'quvchining bmi: ${weight / (bodylength * bodylength)}"
        override fun toString(): String {
            return "Bmi(weight=$weight, bodylength=$bodylength)"
        }
    }

}