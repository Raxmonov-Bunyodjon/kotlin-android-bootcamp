package Topshiriq2

import jdk.jfr.DataAmount

interface CardService {
    fun transfer(fromCard: String, toCard: String, amount: Double)
    fun refund(transactionId: Int)
    fun report()
}