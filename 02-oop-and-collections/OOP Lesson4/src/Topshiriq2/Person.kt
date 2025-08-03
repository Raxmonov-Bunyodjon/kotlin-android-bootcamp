package Topshiriq2

open class Person: PersonalIdentifiable {

     var firstName: String = ""
     var lastName: String = ""
     var middleName: String = ""
     var birthYear: Int = 0
     var gender: String = ""
     var id: Int = 1

    constructor(firstName: String, lastName: String, middleName: String, birthYear: Int, gender: String, id: Int) {
        this.firstName = firstName
        this.lastName = lastName
        this.middleName = middleName
        this.birthYear = birthYear
        this.gender = gender
        this.id = id
    }

    override fun id(): Int = id

    override fun getFullName(): String = "Familyasi: ${lastName}, Ismi: ${firstName}, Otasini ismi: ${middleName} "
}