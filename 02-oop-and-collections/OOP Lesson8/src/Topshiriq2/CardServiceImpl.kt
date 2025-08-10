package Topshiriq2

class CardServiceImpl : CardService {
    private val cards = mutableListOf<Card>()
    private val transactions = mutableListOf<Transaction>()
    private var transactionIdCounter = 1

    fun addCard(card: Card) {
        cards.add(card)
    }

    override fun transfer(fromCard: String, toCard: String, amount: Double) {
        val sender = cards.find { it.cardNumber == fromCard }
        val receiver = cards.find { it.cardNumber == toCard }

        if (sender != null && receiver != null && sender.withdraw(amount)) {
            receiver.deposit(amount)
            transactions.add(Transaction(transactionIdCounter++, fromCard, toCard, amount))
            println("✅ Transfer muvaffaqiyatli!")
        } else {
            println("❌ Transfer amalga oshmadi!")
        }
    }

    override fun refund(transactionId: Int) {
        val transaction = transactions.find { it.id == transactionId }
        if (transaction != null && transaction.status == "SUCCESS") {
            val sender = cards.find { it.cardNumber == transaction.fromCard }
            val receiver = cards.find { it.cardNumber == transaction.toCard }

            if (receiver != null && receiver.withdraw(transaction.amount)) {
                sender?.deposit(transaction.amount)
                transaction.status = "REFUNDED"
                println("✅ Pul qaytarildi!")
            }
        } else {
            println("❌ Qaytarish amalga oshmadi!")
        }
    }

    override fun report() {
        println("📜 Tranzaksiyalar ro‘yxati:")
        transactions.forEach { println(it) }
    }
}