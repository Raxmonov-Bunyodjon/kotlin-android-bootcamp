package Topshiriq3

data class Post(
    val id: Int,
    val author: User,
    var content: String,
    var likes: Int = 0
) {
    fun editPost(newContent: String) {
        content = newContent
        println("✅ Post yangilandi!")
    }

    fun addLike() {
        likes++
    }
}