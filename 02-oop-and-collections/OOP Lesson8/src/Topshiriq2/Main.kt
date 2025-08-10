package Topshiriq2

fun main(args: Array<String>) {

    val service = CardServiceImpl()

    val card1 = Card("8600123456789012", "Ali", 1000.0)
    val card2 = Card("9860123456789012", "Vali", 500.0)

    service.addCard(card1)
    service.addCard(card2)

    service.transfer("8600123456789012", "9860123456789012", 200.0)
    service.report()

    service.refund(1)
    service.report()

}
