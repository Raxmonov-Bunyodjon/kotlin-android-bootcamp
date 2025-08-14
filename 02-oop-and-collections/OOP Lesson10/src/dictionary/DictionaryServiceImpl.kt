package dictionary

import java.awt.Window
import java.util.Scanner

class DictionaryServiceImpl: DictionaryService {

    var wordMap = HashMap<String, String>()
    var scanner = Scanner(System.`in`)

    override fun addWord() {
        println("So'zni kiriting:")
        var word = scanner.next()
        println("Tarjimasini kiriting:")
        var translate = scanner.next()

        wordMap.put(word,translate)
        println("Muvaffaqiyatli qo'shildi!")
    }

    override fun listWord() {
        for (key in wordMap.keys) {
            println("$key -> ${wordMap[key]}")
        }
    }

    override fun removeWord() {
        var isRemove = false
        println("O'chirilayotgan so'zni kiriting:")
        var removeWord = scanner.next()
        val keySet = wordMap.keys
        for (s in keySet) {
            if (s == removeWord){
                wordMap.remove(s)
                isRemove = true
                break
            }
        }
        if (isRemove){
            println("Muvaffaqiyatli o'chirildi")
        }else{
            println("O'chirilayotgan so'z topilmadi!")
        }
    }

    override fun editWord() {
        println("O'zgartirilayotgan so`zni kiriting:")
        var isEdit = false
        var editWord = scanner.next()

        val keySet = wordMap.keys
        for (s in keySet) {
            if (s==editWord){
                isEdit = true
                break
            }
        }
        if ( isEdit) {
            println("Yangi so`zni kiriting:")
            var newWord = scanner.next()
            println("Yangi tarjimasini kiriting:")
            var newTranslate = scanner.next()

            //1-> so'z bilan birgalikda o'zgartirish
            wordMap.remove(editWord)
            wordMap.put(newWord, newTranslate)

//            //2 -> faqat tarjimasini o'zgartirish
//            wordMap.replace(editWord, newTranslate)
        }else{
            println("O'zgartirilayotgan so'z topilmadi!")
        }
    }

    override fun searchWord() {
        println("Qidirilayotgan so'z va tarjimani kiriting:")
        var a = scanner.next()

        for (key in wordMap.keys) {
            val value = wordMap[key]
            if(key==a||value==a){
                println("$key -> $value")
            }
        }
    }
}