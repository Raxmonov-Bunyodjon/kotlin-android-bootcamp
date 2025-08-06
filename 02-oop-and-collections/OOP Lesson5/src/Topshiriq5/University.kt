package Topshiriq5

data class University(
    var firstName: String,
    var lastName: String,
    var middleName: String,
    var specialty: String,   //mutaxassis
    var faculty: String,
    var course: Int,
    var group: String,
    var educationType: String,
    var paymentMethod:  String,
    var educationalForm: String,
    var academicYear: String,
    var semester: Int
){

    fun educationinfo(): String = "Talabani ismi: ${firstName},\nFamilyasi: ${lastName},\nO'quv yo'nalishi: ${specialty},\nFakulteti: ${faculty},\nKursi: ${course},\n Guruhi: ${group} "

    class PersonalInfo {
        var citizenship: String = ""
        var passportNumber: String = ""
        var personalIdCode: String = "" //jshr
        var lastName: String = ""
        var firstName: String = ""
        var middleName: String = ""
        var dateOfBirth: String = ""
        var gender: String = ""
        var nationality: String = ""
        var country: String = ""
        var region: String = ""
        var district: String = ""
        var homeAddress: String = ""

    constructor(
        citizenship: String,
        passportNumber: String,
        personalIdCode: String,
        lastName: String,
        firstName: String,
        middleName: String,
        dateOfBirth: String,
        gender: String,
        nationality: String,
        country: String,
        region: String,
        district: String,
        homeAddress: String,
    ) {
        this.citizenship = citizenship
        this.passportNumber = passportNumber
        this.personalIdCode = personalIdCode
        this.lastName = lastName
        this.firstName = firstName
        this.middleName = middleName
        this.dateOfBirth = dateOfBirth
        this.gender = gender
        this.nationality = nationality
        this.country = country
        this.region = region
        this.district = district
        this.homeAddress = homeAddress
    }


    fun personalInfo(): String = "Fuqarolik: ${citizenship}\t\n" +
            "Pasport raqami: ${passportNumber}\t\n" +
            "JSHSHIR-kod: ${personalIdCode}\t\n" +
            "Familiya: ${lastName}\t\n" +
            "Ismi: ${firstName}\t\n" +
            "Otasining ismi: ${middleName} \t\n" +
            "Tug‘ilgan sana: ${dateOfBirth}\t\n" +
            "Jins: ${gender}\t\n" +
            "Millat: ${nationality}\t\n" +
            "Davlat: ${country}\t\n" +
            "Viloyat: ${region}\t\n" +
            "Tuman: ${district}\t\n" +
            "Uy manzili: ${homeAddress} "
            //"Ta'lim ma'lumotlari: ${educationinfo()} " bu yerda ishlamaydi tashqi classning methodi va hususiyatlari chunki bu Nested class
}

    inner class Resume {

        var address: String = ""
        var telNumber: String = ""
        var gmail: String = ""
        var dateOfBirth: String = ""
        var languages: String = ""
        var educations: String = ""
        var projects: String = ""
        var profile: String = ""
        var skills: String = ""

        constructor(
            address: String,
            telNumber: String,
            gmail: String,
            dateOfBirth: String,
            languages: String,
            educations: String,
            projects: String,
            profile: String,
            skills: String,
        ) {
            this.address = address
            this.telNumber = telNumber
            this.gmail = gmail
            this.dateOfBirth = dateOfBirth
            this.languages = languages
            this.educations = educations
            this.projects = projects
            this.profile = profile
            this.skills = skills
        }

        fun getresume(): String = "<<<<<Talabaning Resumesi>>>>>\nManzili: ${address},\nTefonraqami: ${telNumber},\nGmaili: ${gmail},\nTug'ilgan yili, oyi, va kuni: ${dateOfBirth},\nTillarni bilishi: ${languages},\nO'qigan barcha ta'lim ma'lumoti: ${educations},\nBajargan loyihalari: ${projects},\nQilganishlar haqida ma'lumotlar: ${profile},\nKo'nikmalari: ${skills},\nTa'lim ma'lumotlari: ${educationinfo()}"
    }
}

