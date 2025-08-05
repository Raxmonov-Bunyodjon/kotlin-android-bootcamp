package Topshiriq3

fun main(args: Array<String>) {

    var student1 = SchoolRegistration(
        "Bunyodjon",
        "Raxmonov",
        "Baxodir",
        15,
        "AB 6889034",
        "+998997235955",
        ":) bor",
        "Bor",
        "Yo'q",
        "Yo'q",
        "Ha o'qiyman"
    )
    var student2 = SchoolRegistration(
        "Murodjon",
        "Raxmonov",
        "Inom",
        8,
        "AB 6889444",
        "+998997234444",
        ":) bor",
        "Bor",
        "Ha o'qiyman",
        "Yo'q",
        "Yo'q"
    )
    var student3 = SchoolRegistration(
        "Sardor",
        "Raxmonov",
        "Inom",
        12,
        "AB 6889444",
        "+998997234444",
        ":) bor",
        "Bor",
        "Yo'q",
        "Ha o'qiyman",
        "Yo'q"
    )
    //farqi bor
    var student4 = SchoolRegistration.Bmi(86.0, 1.80)
    //
    student2.GetLoginParol("Murod", "321")
    student3.GetLoginParol("Sardor", "456")

    println("<<<<<<<<<<Inner Class obeyktlari>>>>>>>>>>>>>")
    println("Talabalar maktabga ro'yxatdan o`tish jarayoni:\n<<<<<$$$$$$>>>>>\nTalabaning ro'yxatdan o'gadagi ma'lumotlar:\n${student1.toString()}\nLogin_Paroli: ${student1}")
    println(
        "Talabalar maktabga ro'yxatdan o`tish jarayoni:\n<<<<<$$$$$$>>>>>\nTalabaning ro'yxatdan o'gadagi ma'lumotlar:\n${student2.toString()}\nemaktab: ${
            student2.GetLoginParol(
                "Murod",
                "321"
            ).emaktab(8)
        }     "
    )
    println("Talabalar maktabga ro'yxatdan o`tish jarayoni:\n<<<<<$$$$$$>>>>>\nTalabaning ro'yxatdan o'gadagi ma'lumotlar:\n${student3.toString()}")
    println("<<<<<<<<<<Nested Class obeykti>>>>>>>>>>>>>")
    println("Talabaning BMI ma'lumoti:\n${student4.findBmi()}")
}