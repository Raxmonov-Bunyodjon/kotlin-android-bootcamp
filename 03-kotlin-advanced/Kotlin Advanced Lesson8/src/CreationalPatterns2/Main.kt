package CreationalPatterns2

fun main(args: Array<String>) {

    val payment1 = PaymentFactory.createPayment("card")
    payment1.pay(100.0)

    val payment2 = PaymentFactory.createPayment("cash")
    payment2.pay(50.0)

    val payment3 = PaymentFactory.createPayment("paypal")
    payment3.pay(200.0)

}