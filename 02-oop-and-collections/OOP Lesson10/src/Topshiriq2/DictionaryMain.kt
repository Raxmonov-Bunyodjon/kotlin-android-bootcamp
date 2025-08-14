package Topshiriq2

import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    var dictionaryService = DictionaryServiceImpl()

    while (true) {
        println(
            "1->So'z va tarjima qo'shish;" +
                    "2->So'zlarni ko'rish;" +
                    "3->So'zni o'chirish;" +
                    "4->So'zni o'zgartirish;" +
                    "5->So'zni qidirish."
        )
        var n = scanner.nextInt()

        when (n) {
            1 -> {
                dictionaryService.addDictionary()
            }

            2 -> {
                dictionaryService.allDictionary()
            }

            3 -> {
                dictionaryService.removeDictionary()
            }

            4 -> {
                dictionaryService.editDictionary()
            }

            5 -> {
                dictionaryService.searchDictionary()
            }
        }
    }
}