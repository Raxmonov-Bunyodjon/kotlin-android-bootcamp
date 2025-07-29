package Topshiriq4

import jdk.jfr.DataAmount

class Account {
    private var id: String
    private var name: String
    private var balance: Int = 0

    constructor(id: String, name: String) {
        this.id = id
        this.name = name
        this.balance = 0
    }

    constructor(id: String, name: String, balance: Int) {
        this.id = id
        this.name = name
        this.balance = balance
    }

    fun getID(): String = id
    fun getName(): String = name
    fun getBalance(): Int = balance

    fun credit(amount: Int): Int {
        if (amount > 0) {
            balance += amount
        }
        return balance
    }


    fun debit(amount: Int): Int {
        return if (amount <= balance) {
            balance -= amount
            balance
        } else {
            println("Xatolik: Yetarli mablag‘ mavjud emas.")
            balance
        }
    }

    fun transferTo(another: Account, amount: Int): Int {
        return if (amount <= balance) {
            this.balance -= amount
            another.balance += amount
            this.balance
        } else {
            println("Xatolik: O‘tkazma amalga oshmadi, yetarli mablag‘ mavjud emas.")
            this.balance
        }
    }

    override fun toString(): String {
        return "Account(id='$id', name='$name', balance=$balance)"
    }

}