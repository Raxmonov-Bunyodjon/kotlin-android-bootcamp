class User(var username: String = "key", var password: String) {

    fun printUser(){
        println("$username $password")
    }
}