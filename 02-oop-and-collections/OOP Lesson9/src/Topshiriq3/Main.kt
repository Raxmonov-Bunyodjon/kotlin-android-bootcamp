package Topshiriq3

import java.util.Scanner

fun main(args: Array<String>) {
    //Fuqarolarga pasport berish tartibini loyihalashtiring.
// Bunda pasport seriya raqami unikal ya'ni qayta takrorlanmasligini ta'minlang.
    val service = PassportServiceImpl()

    val passport1 = Passport(
        type = "P",
        countryCode = "UZ",
        passportNumberSerial = "AB1234567",
        surName = "Aliyev",
        givenNames = "Ali",
        fatherIsName = "Vali",
        dateOfBirth = "1990-01-01",
        gender = "M",
        placeOfBirth = "Tashkent",
        dateOfIssue = "2020-01-01",
        dateOfExpiry = "2030-01-01",
        authority = "Tashkent GOV"
    )

    val passport2 = Passport(
        type = "P",
        countryCode = "UZ",
        passportNumberSerial = "AB1234567", // ❗ Duplicate serial
        surName = "Karimov",
        givenNames = "Karim",
        fatherIsName = "Sodiq",
        dateOfBirth = "1992-02-02",
        gender = "M",
        placeOfBirth = "Samarkand",
        dateOfIssue = "2021-02-02",
        dateOfExpiry = "2031-02-02",
        authority = "Samarkand GOV"
    )

    println("➕ Adding first passport:")
    service.addInfo(passport1)

    println("\n➕ Adding second passport (duplicate serial):")
    service.addInfo(passport2)

    println("\n📋 Showing all passports:")

}

