package Topshiriq2

import jdk.jshell.Snippet

//Order nomli class yarating  va undan 5 ta obyekt oling.
class Order {

    var id: Int = 0
    var customerName: String = ""
    var productName: String = ""
    var quantity: Double = 0.0
    var price: Double = 0.0
    var status: String = ""
    var date: String = ""


    fun calculateTotal(): Double {
        return quantity * price
    }

    fun changeStatus(newStatus: String){
        status = newStatus
    }

    fun printSummary(){
        println("Order #$id - $productName x $quantity")
        println("Customer: $customerName")
        println("Total: \$${calculateTotal()}")
        println("Status: $status, Date: $date")
    }
}

