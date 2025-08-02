class User {

    var username: String = ""

    var password: String = ""

    constructor(username: String, password: String) {
        this.username = username
        this.password = password
    }

    override fun toString(): String {
        return "User(username='$username', password='$password')"
    }


}
