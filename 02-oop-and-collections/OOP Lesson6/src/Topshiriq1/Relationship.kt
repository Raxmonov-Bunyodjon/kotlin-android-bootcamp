package Topshiriq1

object Relationship {
    private var name: String = ""
    private var gender: String = ""
    private var age: Int = 0

    fun setUser(newName: String, newGender: String, newAge: Int) {
        name = newName
        gender = newGender
        age = newAge
    }

    fun showInfo() {
        println("👤 Ism: $name")
        println("🚻 Jins: $gender")
        println("🎂 Yosh: $age")
    }

    fun clear() {
        name = ""
        gender = ""
        age = 0
        println("✅ Ma'lumotlar tozalandi.")
    }

    override fun toString(): String {
        return "Relationship(name='$name', gender='$gender', age=$age)"
    }
}