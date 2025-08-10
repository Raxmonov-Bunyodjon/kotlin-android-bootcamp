package package1

import java.awt.SystemTray
import java.util.Scanner

class ArticleServiceImpl : ArticleInterface {

    var articleList = ArrayList<Article>()
    var scanner = Scanner(System.`in`)

    override fun addArticle() {
        println("Maqola sarlavhasini kiriting:")
        var title = scanner.nextLine()
        println("Maqola mazmunini kiriting:")
        var description = scanner.nextLine()
        var article = Article(title, description)
        articleList.add(article)
    }

    override fun editArticle() {

        println("Qaysi o'rondagi maqolani o'chirmoqchisiz?")
        for (i in articleList.indices) {
            println("${(i + 1)}.${articleList[i]}")
        }

        var number = scanner.nextInt()
        scanner = Scanner(System.`in`)
        println("Yangi maqola sarlavhasini kirirting:")
        var newTitle = scanner.nextLine()
        scanner = Scanner(System.`in`)
        println("Yangi maqola mazmunini kiriting:")
        var newDescription = scanner.nextLine()
//        var newArticle = Article(newTitle,newDescription)
//        articleList.set(number-1,newArticle)

        articleList[number - 1].title = newTitle
        articleList[number - 1].description = newDescription


    }

    override fun removeArticle() {
        println("Qaysi o'rindagi maqolani o'chirmoqchisiz?")
        for (i in articleList.indices) {
            println("${i + 1}.${articleList[i]}")
        }

        var index = scanner.nextInt()
        articleList.removeAt(index-1)
    }

    override fun searchArticle() {
        println("Sarlavha yoki mazmunni kiriting:")
        var a = scanner.nextLine()
        for (article in articleList) {
            if (article.title == a || article.description == a){
                println(article)
            }
        }
    }

    override fun listArticles() {
        println("Barcha maqolalar ro'yxati:")
        for (article in articleList){
            println(article)
        }
    }
}