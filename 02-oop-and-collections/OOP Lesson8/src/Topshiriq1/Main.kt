package Topshiriq1

import java.util.Scanner

fun main(args: Array<String>) {

    var scanner = Scanner(System.`in`)
    var listClassService = listClassServiceImpl()
    while (true) {
        println(
            "1->O'quvchini qo`shish;" +
                    "2->O'quvchini o'zgartirish;" +
                    "3->O'quvchini o'chirish;" +
                    "4->O'quvchini qidirish;" +
                    "5->O'quvchilar ro'yxati."
        )

        var index = scanner.nextInt()

        when (index) {
            1 -> {
                listClassService.addToList()
            }

            2 -> {
                listClassService.editToList()
            }

            3 -> {
                listClassService.removeToList()
            }

            4 -> {
                listClassService.searchToList()
            }

            5 -> {
                listClassService.showAllList()
            }
        }
    }
}