package Topshiriq1

class User {

    var firstName: String = ""
    var lastName: String = ""
    var location: String = ""
    var workplace: String = ""
    var gender: String = ""


    constructor(firstName: String, lastName: String, location: String, workplace: String, gender: String) {
        this.firstName = firstName
        this.lastName = lastName
        this.location = location
        this.workplace = workplace
        this.gender = gender
    }

    class Gamer {

        var firstName: String = ""
        var lastName: String = ""
        var position: String = ""

        constructor(firstName: String, lastName: String, position: String) {
            this.firstName = firstName
            this.lastName = lastName
            this.position = position
        }

        fun foodballer(): String =
            "Gamer about info: Firstaname: ${firstName}, Lastname: ${lastName}, Position: ${position}  "
    }
}