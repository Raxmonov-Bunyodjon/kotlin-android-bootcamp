open class User {

    var userName: String = ""
    var password: String = ""

    constructor()

    constructor(userName: String, password: String) {
        this.userName = userName
        this.password = password
    }

    open fun showUser(){
        println("User")
    }


}