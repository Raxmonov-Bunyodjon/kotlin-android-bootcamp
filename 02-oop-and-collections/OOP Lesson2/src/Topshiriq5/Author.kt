package Topshiriq5

class Author {
    private var name: String = ""
    private var email: String = ""
    private var gender: Char = ' '

    constructor(name: String, email: String, gender: Char) {
        this.name = name
        this.email = email
        this.gender = gender
    }

    fun getName(): String = name
    fun getEmail(): String = email
    fun setEmail(email: String){
        this.email = email
    }
    fun getGender(): Char = gender

    override fun toString(): String {
        return "Author(name='$name', email='$email', gender=$gender)"
    }


}






