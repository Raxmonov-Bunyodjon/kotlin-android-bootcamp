package Topshiriq3

class Abonent: AttributeHolder, InfoPrintable {

    //Hususiyatlari
    private var id: Int = 1
    private var lastName: String = "Mamatqulov"
    private var firstName: String = "Jalol"
    private var middleName: String = "Baxtiyor"
    private var address: String = "Tashkent"
    private var creditCardNumber: Long = 5555666677778888
    private var debit: Double = 22.0
    private var credit: Double = 33.0
    private var localCallTime: Int = 57
    private var longDistanceTime: Int = 60

    constructor(
        id: Int,
        lastName: String,
        firstName: String,
        middleName: String,
        address: String,
        creditCardNumber: Long,
        debit: Double,
        credit: Double,
        localCallTime: Int,
        longDistanceTime: Int,
    ) {
        this.id = id
        this.lastName = lastName
        this.firstName = firstName
        this.middleName = middleName
        this.address = address
        this.creditCardNumber = creditCardNumber
        this.debit = debit
        this.credit = credit
        this.localCallTime = localCallTime
        this.longDistanceTime = longDistanceTime
    }

    constructor()


    fun getLongDistanceTime(): Int{
        return longDistanceTime
}

    fun  getLocalCallTime(): Int{
        return localCallTime
    }

    fun getLastName(): String {
        return lastName
    }

    override fun setAttributes(attrMap: Map<String, Any>) {
        if (attrMap["id"] is Int) id = attrMap["id"] as Int
        if (attrMap["lastName"] is String) lastName = attrMap["lastName"] as String
        if (attrMap["firstName"] is String) firstName = attrMap["firstName"] as String
        if (attrMap["middleName"] is String) middleName = attrMap["middleName"] as String
        if (attrMap["address"] is String) address = attrMap["address"] as String
        if (attrMap["creditCardNumber"] is Long) creditCardNumber = attrMap["creditCardNumber"] as Long
        if (attrMap["debit"] is Double) debit = attrMap["debit"] as Double
        if (attrMap["credit"] is Double) credit = attrMap["credit"] as Double
        if (attrMap["localCallTime"] is Int) localCallTime = attrMap["localCallTime"] as Int
        if (attrMap["longDistanceTime"] is Int) longDistanceTime = attrMap["longDistanceTime"] as Int
    }

    override fun getAttributes(): Map<String, Any> {
        return mapOf(
            "id" to id,
            "firstName" to firstName,
            "lastName" to lastName,
            "middleName" to middleName,
            "address" to address,
            "creditCardNumber" to creditCardNumber,
            "debit" to debit,
            "credit" to credit,
            "localCallTime" to localCallTime,
            "longDistanceTime" to longDistanceTime
        )
    }

    override fun printInfo(): Unit {
        println("ID: $id")
        println("Full Name: $lastName $firstName $middleName")
        println("Address: $address")
        println("Credit Card Number: $creditCardNumber")
        println("Debit: $debit so'm")
        println("Credit: $credit so'm")
        println("Local Call Time: $localCallTime sekund")
        println("Long Distance Time: $longDistanceTime sekund")
    }
}