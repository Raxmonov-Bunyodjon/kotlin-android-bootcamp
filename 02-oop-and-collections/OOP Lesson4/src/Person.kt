abstract class Person(var age: Int, var name: String) {


    fun displayAge() {
        println("$name $age")
    }

    abstract fun displayJob()


}