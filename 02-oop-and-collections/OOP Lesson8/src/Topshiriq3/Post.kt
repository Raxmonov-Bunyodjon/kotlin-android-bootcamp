package Topshiriq3


data class User(
    val id: Int,
    val username: String,
    var password: String,
    var status: String = "Online"
) {
    fun changeStatus(newStatus: String) {
        status = newStatus
        println("✅ Status yangilandi: $status")
    }
}