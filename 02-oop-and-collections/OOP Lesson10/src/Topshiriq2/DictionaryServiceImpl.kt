package Topshiriq2

import java.util.Scanner

class DictionaryServiceImpl : DictionaryService {

    var wordMap = HashMap<String, List<String>>()
    var scanner = Scanner(System.`in`)

    override fun addDictionary() {
        println("So'zni kiriting:")
        var word = scanner.next()
        println("So'zni tarjimasini kiriting:")
        var translate = scanner.next()
        println("So'zni sinonimini kiriting:")
        var synonym = scanner.next()

        wordMap.put(word, listOf(translate, synonym))
        println("Muvaffaqiyatli qo'shildi!")
    }

    override fun allDictionary() {
        for (key in wordMap.keys) {
            println("$key  ${wordMap[key]}")
        }
    }

    override fun removeDictionary() {
        var isRemove = false
        println("O'chirilayotgan so'zni kiriting:")
        var removeWord = scanner.next()
        //Kalitlar ro'yxati bo'yicha aylanamiz
        val iterator = wordMap.iterator()
        while (iterator.hasNext()) {
            val entry = iterator.next()
            val key = entry.key
            val values = entry.value

            // Agar kalit yoki qiymatlar ro'yxatida removeWord bo'lsa
            if (key == removeWord || values.contains(removeWord)) {
                iterator.remove()
                isRemove = true
            }
        }
        if (isRemove) {
            println("Muvaffaqiyatli o'chirildi")
        } else {
            println("O'chirilayotgan so'z topilmadi")
        }
    }

    override fun editDictionary() {
        println("O'zgartirilayotgan so'zni kiriting:")
        var editWord = scanner.next()
        var isEdit = false
        var keySet = wordMap.keys

        for (s in keySet) {
            if (s == editWord) {
                isEdit = true
                break
            }
        }
        if (isEdit) {
            println("Yangi so'zni kiriting:")
            var newWord = scanner.next()
            println("Yangi tarjimasini kiriting:")
            var newTranslate = scanner.next()
            println("Yangi sinonimini kiriting:")
            var newSynonym = scanner.next()


            wordMap.remove(editWord)
            wordMap.put(newWord, listOf(newTranslate, newSynonym))

        } else {
            println("O'zgartirilayotgan so'z topilmadi!")
        }
    }

    override fun searchDictionary() {
        println("Qidirilayotgan so'zni kiriting:")
        var searchWord = scanner.next()

        for (key in wordMap.keys) {
            val valueList = wordMap[key]
            if (key.toString() == searchWord || valueList?.contains(searchWord) == true) {
                println("$key -> $valueList")
            }
        }

    }
}