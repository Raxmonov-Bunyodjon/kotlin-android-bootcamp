package package1

class Article {
    var title: String = ""
    var description: String = ""

    constructor(title: String, description: String) {
        this.title = title
        this.description = description
    }

    override fun toString(): String {
        return "Article(title='$title', description='$description')"
    }
}