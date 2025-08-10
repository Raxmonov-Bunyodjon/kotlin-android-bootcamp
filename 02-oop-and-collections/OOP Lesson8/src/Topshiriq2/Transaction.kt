package Topshiriq2


import java.time.LocalDateTime

data class Transaction(
    val id: Int,
    val fromCard: String,
    val toCard: String,
    val amount: Double,
    val date: LocalDateTime = LocalDateTime.now(),
    var status: String = "SUCCESS"
)