import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    var eng = arrayOfNulls<String>(100)
    var uzb = arrayOfNulls<String>(100)
    var count = 0


    while (true) {
        println(
            "1->Eng to Uzb So'z qo'shish yoki Uzb to Eng So'z qo'shish; \n2->Eng to Uzb So'z chiqarish yoki Uzb to Eng So'z chiqarish;   \n3->So'zlar ma'lumotlarini o'zgartirish;  \n4->So'zlarni o'chirish;   5->Barcha so'zlar ro'yxati."
        )
        var n = scanner.nextInt()

        when (n) {
            1 -> {
                println("So'zlarni kiritish uchun masalan: Eng->Uzb >> English orqali bo`lsa 1 yoki Uzb->Eng >> Uzbek orqali 2 kiriting: ")
                var t = scanner.next()
                when (t) {
                    "1" -> {
                        println("Inglishcha so'z qo'shing!;")
                        var eng_q = scanner.next()
                        println("Shu so'zni O'zbekcha tarjimasini qo'shing!;")
                        var uzb_t = scanner.next()
                        eng[count] = eng_q
                        uzb[count] = uzb_t
                        count++
                        println("Muvaffaqiyatli lug'at eng->uzb qo'shildi")
                    }

                    "2" -> {
                        println("O'zbekcha so'z qo'shing!;")
                        var uzb_q = scanner.next()
                        println("Shu so'zni Inglizcha tarjimasini qo'shing!;")
                        var eng_t = scanner.next()
                        uzb[count] = uzb_q
                        eng[count] = eng_t
                        count++

                        println("Muvaffaqiyatli lug'at uzb->eng qo'shildi")
                    }

                    else -> {
                        println("Iltimos 1 yoki 2 kiriting!")
                    }
                }
            }

            2 -> {
                println("So'zlarni qidirish masala: agar English orqali bo`lsa 1 yoki Uzbek orqali 2 kiriting: ")
                var m = scanner.next()

                when (m) {
                    "1" -> {
                        println("English so'zni kiriting:")
                        var searchbyEnglish = scanner.next()

                        for (item in 0 until count) {
                            if (eng[item] != null && eng[item]?.lowercase() == searchbyEnglish.lowercase()) {
                                println(eng[item])
                                println(uzb[item])
                            }
                        }
                    }

                    "2" -> {
                        println("Uzbek so'zni kiriting:")
                        var searchbyUzbek = scanner.next()

                        for (item in 0 until count) {
                            if (uzb[item] != null && uzb[item]?.lowercase() == searchbyUzbek.lowercase()) {
                                println(uzb[item])
                                println(eng[item])
                            }
                        }
                    }

                    else -> {
                        println("Iltimos 1 yoki 2 kiriting!")
                    }
                }
            }

            3 -> {
                println("O'zgartirilayotgan so`zni kiriting masalan English orqali 1, Uzbek orqali 2 bosing!: ")
                var j = scanner.next()
                when (j) {
                    "1" -> {
                        println("O'zgartirilayotgan Englishcha so`zni kiriting: ")
                        var editEnglish = scanner.next()
                        var isHave = false
                        var index = -1
                        for (item in 0 until count) {
                            if (eng[item] == editEnglish) {
                                isHave = true
                                index = item
                                break
                            }
                        }
                        if (isHave) {
                            println("Yangi English so'zni kiriting: ")
                            var newEnglish = scanner.next()
                            println("Yangi Uzbekcha so'zni kiriting: ")
                            var newUzbek = scanner.next()
                            eng[index] = newEnglish
                            uzb[index] = newUzbek
                            println("Muvaffaqiyatli o'zgartirildi!")
                        } else {
                            println("Bunday so‘z topilmadi!")
                        }
                    }

                    "2" -> {
                        println("O'zgartirilayotgan Uzbekcha so`zni kiriting: ")
                        var editUzbek = scanner.next()
                        var isHave = false
                        var index = -1
                        for (item in 0 until count) {
                            if (uzb[item] == editUzbek) {
                                isHave = true
                                index = item
                                break
                            }
                        }
                        if (isHave) {
                            println("Yangi Uzbekcha so'zni kiriting: ")
                            var newUzbek = scanner.next()
                            println("Yangi Englishcha so'zni kiriting: ")
                            var newEnglish = scanner.next()
                            eng[index] = newEnglish
                            uzb[index] = newUzbek
                            println("Muvaffaqiyatli o'zgartirildi!")
                        } else {
                            println("Bunday so‘z topilmadi!")
                        }
                    }

                    else -> {
                        println("Iltimos 1 yoki 2 kiriting!")
                    }
                }
            }
            4 -> {
                println("O'chirilayotgan so`zni kiriting maslan English orqali 1, Uzbek orqali 2 bosing!: ")
                var g = scanner.next()

                when (g) {
                    "1" -> {
                        println("English so'z kiritish orqali o'chirish")
                        var deleteEnglish = scanner.next()

                        var isHave = false
                        var index = -1
                        for (item in 0 until count) {
                            if (eng[item] == deleteEnglish) {
                                isHave = true
                                index = item
                                break
                            }
                        }
                        if (isHave) {
                            for (item in index until count - 1) {
                                eng[item] = eng[item + 1]
                                uzb[item] = uzb[item + 1]
                            }
                            eng[count - 1] = null
                            uzb[count - 1] = null
                            count--
                            println("Muvaffaqiyatli so`z o'chirildi!")
                        }
                    }

                    "2" -> {
                        println("Uzbek so'z kiritish orqali o'chirish")
                        var deleteEnglish = scanner.next()

                        var isHave = false
                        var index = -1
                        for (item in 0 until count) {
                            if (eng[item] == deleteEnglish) {
                                isHave = true
                                index = item
                                break
                            }
                        }
                        if (isHave) {
                            for (item in index until count - 1) {
                                eng[item] = eng[item + 1]
                                uzb[item] = uzb[item + 1]
                            }
                            eng[count - 1] = null
                            uzb[count - 1] = null
                            count--
                            println("Muvaffaqiyatli so`z o'chirildi!")
                        }
                    }

                    else -> {
                        println("Iltimos 1 yoki 2 kiriting!")
                    }
                }
            }

            5 -> {
                for (item in 0 until count) {
                    println(eng[item])
                    println(uzb[item])
                    println()
                }
            }
        }
    }
}
