package dictionary

import java.util.Scanner

fun main(args: Array<String>) {

    var scanner = Scanner(System.`in`)
    var dictionaryService = DictionaryServiceImpl()

    while(true){
        println("1->So'z va tarjima qo'shish;" +
                "2->So'zlarni ko'rish;" +
                "3->So'zni o'chirish;" +
                "4->So'zni o'zgartirish;" +
                "5->So'zni qidirish.")
        var n= scanner.nextInt()

        when(n){
            1->{
                dictionaryService.addWord()
            }
            2->{
                dictionaryService.listWord()
            }
            3->{
                dictionaryService.removeWord()
            }
            4->{
                dictionaryService.editWord()
            }
            5->{
                dictionaryService.searchWord()
            }

        }
    }
}