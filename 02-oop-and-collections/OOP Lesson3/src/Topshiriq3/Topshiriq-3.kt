package Topshiriq3

fun main(args: Array<String>) {

    var person1 = Person(
        name = "Bunyodjon",
        "Sirdaryo Viloyati Xovos tumani Obod turmush (MFY) (Farhod7 dahasi) Yoshlik ko'chasi 20 uy"
    )
    var person2 = Person(
        name = "Murodjon",
        "Sirdaryo Viloyati Xovos tumani Obod turmush (MFY) (Farhod7 dahasi) Yoshlik ko'chasi 30 uy"
    )
    var student1 = Student(
        name = "Adham",
        address = "Sirdaryo Viloyati Xovos tumani Obod turmush (MFY) (Farhod7 dahasi) Yoshlik ko'chasi 25 uy",
        program = "Talabalar dars jadvali",
        year = 3,
        fee = 3000000.0
    )
    var student2 = Student(
        name = "Dilmurod",
        address = "Sirdaryo Viloyati Xovos tumani Obod turmush (MFY) (Farhod7 dahasi) Yoshlik ko'chasi 35 uy",
        program = "Huquq qonunlar",
        year = 2,
        fee = 1500000.0
    )
    var staff1 = Staff(
        name = "Dilmurod",
        address = "Sirdaryo Viloyati Xovos tumani Obod turmush (MFY) (Farhod7 dahasi) Yoshlik ko'chasi 35 uy",
        school = "32-maktab",
        pay = 7_000_000.0
    )
    var staff2 = Staff(
        name = "Shohruh",
        address = "Sirdaryo Viloyati Xovos tumani Obod turmush (MFY) (Farhod7 dahasi) Qanoat ko'chasi 26 uy",
        school = "1-Sonli Kasb Hunar Kolleji",
        pay = 7_000_000.0
    )


    //Eski qiymatlari
    println("<<<<<Eski qiymatlari>>>>>")
    println("Persons Info list: 1.${person1}\n2.${person2}")
    println("Student Info list: 1.${student1}\n2.${student2}")
    println("Staff Info list: 1.${staff1}\n2.${staff2}")

    //O'zgartirliyotgan ma'limotlari
    person1.setName("Jaloliddin")
    person2.setName("Jamol")
    person1.setAddress("Sirdaryo Viloyati Xovos tumani Obod turmush (MFY) (Farhod7 dahasi) Qanoat ko'chasi 17 uy")
    person2.setAddress("Sirdaryo Viloyati Xovos tumani Obod turmush (MFY) (Farhod7 dahasi) Charvodor ko'chasi 48 uy")
    student1.setName("Dostonbek")
    student2.setName("Donyor")
    student1.setAddress("Sirdaryo Viloyati Xovos tumani Obod turmush (MFY) (Farhod7 dahasi) Yoshlik ko'chasi 1 uy")
    student2.setAddress("Sirdaryo Viloyati Xovos tumani Obod turmush (MFY) (Farhod7 dahasi) Chorvador ko'chasi 37 uy")
    student1.setFee(400000.0)
    student2.setFee(600000.0)
    student1.setProgram("Dronlar project")
    student2.setProgram("Magazin do'kon project")
    student1.setYear(4)
    student2.setYear(5)
    staff1.setName("Botirbek")
    staff2.setName("Shaxzod")
    staff1.setAddress("Sirdaryo Viloyati Yangiyer Shahar Do'stlik (MFY) (3 dahasi) Bektemer ko'chasi 12 uy")
    staff2.setAddress("Sirdaryo Viloyati Xovos tumani Obod turmush (MFY) (Farhod7 dahasi) Chorvador ko'chasi 27 uy")
    staff1.setPay(3000000.0)
    staff2.setPay(2000000.0)
    staff1.setSchool("29-maktab")
    staff2.setSchool("12-maktab")

    //Yangilangan ma'lumotlar
    println("<<<<<<<<Yangilangan ma'lumotlar>>>>>>>")
    println("Person ismi: ${person1.getName()}, Address: ${person1.getAddress()}")
    println("Person ismi: ${person2.getName()}, Address: ${person2.getAddress()}")
    println("Talabani ismi: ${student1.getName()}, Addressi: ${student1.getAddress()},\n Dasturi: ${student1.getProgram()}, Yili: ${student1.getYear()}, Fee: ${student1.getFee()}")
    println("Talabani ismi: ${student2.getName()}, Addressi: ${student2.getAddress()},\n Dasturi: ${student2.getProgram()}, Yili: ${student2.getYear()}, Fee: ${student2.getFee()}")
    println("Xodim ismi: ${staff1.getName()}, Addressi: ${staff1.getAddress()},\n Maktabi ishi joyi: ${staff1.getSchool()}, Oylikgi: ${staff1.getPay()}")
    println("Xodim ismi: ${staff2.getName()}, Addressi: ${staff2.getAddress()},\n Maktabi ishi joyi: ${staff2.getSchool()}, Oylikgi: ${staff2.getPay()}")
}
