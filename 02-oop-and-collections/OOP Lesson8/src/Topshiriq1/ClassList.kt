package Topshiriq1

class ClassList {
    var firstName: String = ""
    var lastName: String = ""
    var science: String = ""
    var points: String = ""

    constructor(firstName: String, lastName: String, science: String, points: String) {
        this.firstName = firstName
        this.lastName = lastName
        this.science = science
        this.points = points
    }

    override fun toString(): String {
        return "ClassList(firstName='$firstName', lastName='$lastName', science='$science', points=$points)"
    }
}