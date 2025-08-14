package Topshiriq3

import java.text.ListFormat
import java.util.Scanner

class CountryServiceImpl : CountryService {

    var countryMap = HashMap<String, List<String>>()
    var scanner = Scanner(System.`in`)

    override fun addCountry() {
        println("Mamlakatiz nomini kiriting:")
        var countryName = scanner.nextLine()
        println("Mamlakatizdagi viloyatizni kirting:")
        var regionName = scanner.nextLine()
        println("Mamlakatizdagi yashash markaziy tuman yoki shaharizni kiriting:")
        var liveZone = scanner.nextLine()

        countryMap.put(countryName, listOf(regionName, liveZone))
        println("Muvaffaqiyatli qo'shildi ma'lumotlar!")
    }

    override fun listCountry() {
        for (key in countryMap.keys) {
            println("$key ${countryMap[key]}")
        }
    }

    override fun removeCountry() {
        var isRemove = false
        println("O'chirilayotgan mamlakatizni nomini kiriting:")
        var removeCountry = scanner.nextLine()
        //Kalitlar ro'yxati bo'yicha aylanamiz
        val iterator = countryMap.iterator()
        while (iterator.hasNext()) {
            val entry = iterator.next()
            val key = entry.key
            val values = entry.value

            // Agar kalit yoki qiymatlar ro'yxatida removeWord bo'lsa
            if (key == removeCountry || values.contains(removeCountry)) {
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


    override fun editCountry() {
        println("O'zgartirilayotgan mamlakatiz nomini:")
        var editCountry = scanner.nextLine()
        var isEdit = false
        var keySet = countryMap.keys

        for (s in keySet) {
            if (s == editCountry){
                isEdit = true
                break
            }
        }
        if (isEdit){
            println("Yangi mamlakat nomizni kiriting:")
            var newCountryName = scanner.nextLine()
            println("Yangi mamlakat viloyatizni kiriting:")
            var newRegionName = scanner.nextLine()
            println("Yangi mamlakat yashadigan markaziy tuman yoki shaharizni kiriting")
            var newLiveZone = scanner.nextLine()

            countryMap.remove(editCountry)
            countryMap.put(newCountryName,listOf(newRegionName,newLiveZone))
            println("Muvaffaqiyatli o'zgartirildi")
        }else{
            println("O'zgartirilayotgan so'z topilmadi!")
        }
    }

    override fun searchCountry() {
        println("Qidirilayotgan mamlakatizni nomini kiriting:")
        var searchName = scanner.nextLine()

        for (key in countryMap.keys) {
            val valueList = countryMap[key]
            if (key.toString() == searchName || valueList?.contains(searchName) == true){
                println("$key $valueList")
            }
        }

    }
}