class Teacher(age: Int, name: String) : Person(age, name) {
    override fun displayJob() {
        println("$name teacher")
    }

}