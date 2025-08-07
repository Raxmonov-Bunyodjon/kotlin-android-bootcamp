package Topshiriq2

data class Teacher(var name: String, var science: String, var gender: String, var experienceYear: Int){

    companion object{
        fun getInfo(): Teacher = Teacher("Bunyodjon", "Matematika va Informatika","Erkak", 2)

        fun setInfo(name: String, science: String, gender: String, experienceYear: Int): Teacher =
            Teacher(name, science, gender, experienceYear)
    }


    fun showInfo() {
        println("👨‍🏫 Ism: $name")
        println("📚 Fan: $science")
        println("🚻 Jins: $gender")
        println("📆 Tajriba: $experienceYear yil")
    }
}

