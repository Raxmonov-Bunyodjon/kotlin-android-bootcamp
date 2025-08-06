package Topshiriq5

fun main(args: Array<String>) {

    val student1 = University("Bunyodjon","Raxmonov","Baxodir o'g'li", "Matematika va Informatika", "Sirtqi bo‘lim", 5,"SMI-2-20","To‘lov-shartnoma","Bakalavr","Sirtqi","2024-2025",10).Resume("Sirdaryo Viloyati, Xovos tumani","+998997235999","raxmonovbunyodjon5081999@gmail.com","5-08-1999","Native Uzbek\nEnglish B2\nRussion A2","\nGulDUL SMI 2020-2025\nYanAL 2015-2018","\nBlog website, Hangmang,,,","\nJuda ko'p loyihalar qilganman va Amaliyot o'taganman backend yo`nalishi bo'yicha\n U yerda ko'p texnalogiyalarni o'zlashtirdim hususan Swager, API, \nDgango,Dgango Rest Frameworklar bilan va Admin paneli men juda yaxshi jihatlarni o'zimga oldim.","Ko'nikmalar: Python, Kotlin, OPP")
    val student2 = University("Bektemir","Holmatov","Sayfullo o'g'li", "Matematika va Informatika", "Sirtqi bo‘lim", 5,"SMI-2-20","To‘lov-shartnoma","Bakalavr","Sirtqi","2024-2025",10)
    val student3 = student2.copy("Murodjon", middleName = "Inomjon o'g'li",)
    val student4 = University.PersonalInfo("Uzbekiston","AA 3334343","1234432112344321","Raxmonov","Bunyodjon","Baxodir o'g'li","5-08-1999","Uzbek","O'zbekiston","Sirdaryo","Xovos","Obod turmush","Sirdaryo V,Xovos T, Obod turmush (MFY) F7 dahasi, Yoshlik ko'chasi 20-uy")

    println("<<<<<<Talabaning Umumiy ma'lumotlari>>>>>>")
    println("${student1.getresume()}\n${student2}\n${student3}")
    println("<<<<<<Talabaning ta'lim ma'lumotlari>>>>>>")
    println(student2.educationinfo())
    println(student3.educationinfo())
    println("Talabani Shaxsiya ma'lumot: ${student4.personalInfo()}")
}