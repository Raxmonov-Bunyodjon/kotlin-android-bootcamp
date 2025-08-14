package Topshiriq3

import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    var countryService = CountryServiceImpl()

    while (true) {
        println(
            "1-> Mamlakat nomini qo'shish;" +
                    "2->Barcha mamlakatlarni ko'rish;" +
                    "3->Mamlakatlarni o'chirish;" +
                    "4->Mamlakatlarni o'zgartirish;" +
                    "5->Mamlakatlarni qidirish."
        )
        var n = scanner.nextInt()

        when(n){
            1->{
                countryService.addCountry()
            }
            2->{
                countryService.listCountry()
            }
            3->{
                countryService.removeCountry()
            }
            4->{
                countryService.editCountry()
            }
            5->{
                countryService.searchCountry()
            }
            else -> println("Faqat 1-5 bo`lgan raqam kiriting!")

        }
    }
}