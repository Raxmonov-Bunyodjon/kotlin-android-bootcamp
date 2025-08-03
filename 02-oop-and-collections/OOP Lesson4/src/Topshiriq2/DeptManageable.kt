package Topshiriq2

interface DeptManageable {

    //Yangi xodimni qo‘shadi
    fun assignEmploee(e: Employee)

    //Barcha xodimlarni ro‘yxat qilib beradi
    fun listEmployee(): List<Employee>

    //Belgilangan xodimni olib tashlaydi
    fun removeEmployee(e: Employee): Boolean
}