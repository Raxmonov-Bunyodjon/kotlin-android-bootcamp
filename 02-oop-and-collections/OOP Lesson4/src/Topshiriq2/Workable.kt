package Topshiriq2

interface Workable {

    //	Ish bajarilishini boshlash/ifodalash
    fun doWork(): Unit

    //Bajarilgan ish haqida hisobot qaytaradi
    fun reportTask(): String
}