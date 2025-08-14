package Topshiriq4

import java.util.Scanner

class LaptopPartsServiceImpl: LaptopPartsService {
    val scanner = Scanner(System.`in`)
    var laptopPartsMap = HashMap<String, String>()

    override fun addLaptopPart() {
        println("Noutbukni takibiy qismini nomini kiriting:")
        var nameLaptomPart = scanner.nextLine()
        println("Kiritgan tarkibiy noutbuk qismini nomini nima vazifani bajarishini yozing:")
        var definitionLaptopPart = scanner.nextLine()

        laptopPartsMap.put(nameLaptomPart,definitionLaptopPart)
        println("Muvaffaqiyatli ma'lumot qo'shildi!")
    }

    override fun listLaptopPart() {
        for (key in laptopPartsMap.keys) {
            println("$key ---> ${laptopPartsMap[key]}")
        }
    }

    override fun removeLaptopPart() {
        var isRemove = false
        println("O'chirilayotgan noutbuk tarkibiy qismini nomini kiriting ")
        var removeLaptopPart = scanner.nextLine()
        var keySet = laptopPartsMap.keys
        for (s in laptopPartsMap.keys) {
            if (s == removeLaptopPart){
                laptopPartsMap.remove(s)
                isRemove = true
                break
            }
        }
        if (isRemove){
            println("Ma'lumotlar muvaffaqiyatli o'chirildi!")
        }else{
            println("O'chirilayotgan ma'lumot topilmadi")
        }
    }

    override fun editLaptopPart() {
        var isEdit = false
        println("O'zgartirilayotgan noutbut tarkibiy qismini nomini kiriting:")
        var editLaptopPart = scanner.nextLine()

        var keySet = laptopPartsMap.keys
        for (key in laptopPartsMap.keys) {
            if (key == editLaptopPart){
                laptopPartsMap.remove(key)
                isEdit = true
                break
            }
        }
        if (isEdit){
            println("Yangi noutbuk tarkibiy qismini nomini kiriting")
            var newNameLaptopPart = scanner.nextLine()
            println("Yangi tarkibiy noutbuk qism nomini nima vazifa bajarishini kiriting:")
            var newDefinitionLaptopPart = scanner.nextLine()

            laptopPartsMap.remove(editLaptopPart)
            laptopPartsMap.put(newNameLaptopPart,newDefinitionLaptopPart)


        }else{
            println("O'zgartirilayotgan ma'lumot topilmadi!")
        }
    }

    override fun searchLaptopPart() {
        println("Qidirilayotgan noutbuk tarkibiy qism nomini kiriting \nDiqqat(faqat tarkibiy qism nomi bilan topsayiz bo`ladi):")
        var searchLaptopPart = scanner.nextLine()
        for (key in laptopPartsMap.keys) {
            val value = laptopPartsMap[key]
            if (key == searchLaptopPart||value==searchLaptopPart){
                println("$key -> $value")
            }
        }
    }
}