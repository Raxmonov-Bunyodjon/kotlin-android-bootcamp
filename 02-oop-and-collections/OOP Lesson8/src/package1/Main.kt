package package1

import java.util.Scanner

fun main(args: Array<String>) {

    var scanner = Scanner(System.`in`)
    var articleService = ArticleServiceImpl()
    while (true) {
        println(
            "1->Maqola qo'shish;" +
                    "2->Maqolani o'zgartirish;" +
                    "3->Maqolani o'chirish;" +
                    "4->Maqolani qidirish;" +
                    "5->Barcha maqolalar ro'yxati."
        )

    var index = scanner.nextInt()

    when (index) {
        1 -> {
            articleService.addArticle()
        }

        2 -> {
            articleService.editArticle()
        }

        3 -> {
            articleService.removeArticle()
        }

        4 -> {
            articleService.searchArticle()
        }

        5 -> {
            articleService.listArticles()
        }
    }
}}