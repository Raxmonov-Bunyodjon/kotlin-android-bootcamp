package Topshiriq3

data class Passport(
    val type: String,
    val countryCode: String,
    val passportNumberSerial: String,
    val surName: String,
    val givenNames: String,
    val fatherIsName: String,
    val dateOfBirth: String,
    val gender: String,
    val placeOfBirth: String,
    val dateOfIssue: String,
    val dateOfExpiry: String,
    val authority: String
) {
    // Seriya raqam bo‘yicha unikal bo‘lishi uchun
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Passport) return false
        return passportNumberSerial == other.passportNumberSerial
    }

    override fun hashCode(): Int {
        return passportNumberSerial.hashCode()
    }
}