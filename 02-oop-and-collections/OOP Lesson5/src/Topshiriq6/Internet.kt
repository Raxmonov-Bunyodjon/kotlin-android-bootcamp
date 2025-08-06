package Topshiriq6

import javax.annotation.processing.Messager
import javax.swing.text.Document

sealed class Internet


data class Success(var data: String) : Internet()

data class Failure(var messager: String) : Internet()

object Loading : Internet()


fun operation(internet: Internet) {
    when (internet) {
        is Success -> println("Natija: ${internet.data}")
        is Failure -> println("Xatolik: ${internet.messager}")
        Loading -> println("Yuklanmoqda...")
    }
}