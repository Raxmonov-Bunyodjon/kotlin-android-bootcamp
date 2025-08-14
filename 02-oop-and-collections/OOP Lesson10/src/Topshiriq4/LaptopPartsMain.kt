package Topshiriq4

import java.util.Scanner


fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    var laptopPartsService = LaptopPartsServiceImpl()

    while (true) {
        println(
            "1->Noutbuk qismini nomini qo'shish;" + "2->Barcha tarkibiy qimlarini ko'rish;" + "3->Noutbuk qismini o'chirish;" + "4->Noutbuk qismini o'zgartirish;" + "5->Noutbuk qismini qidirish."
        )
        var n = scanner.nextInt()

        when (n) {
            1 -> {
                laptopPartsService.addLaptopPart()
            }


            2 -> {
                laptopPartsService.listLaptopPart()
            }


            3 -> {
                laptopPartsService.removeLaptopPart()
            }


            4 -> {
                laptopPartsService.editLaptopPart()
            }

            5 -> {
                laptopPartsService.searchLaptopPart()
            }

            else -> {
                println("Faqat 1-5 bo'gan raqamlarni kiriting!")
            }
        }
    }
}


