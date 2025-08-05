package Topshiriq2

class Car {

    var marcaName: String = ""
    var carName: String = ""
    var productionYear: Int = 0
    var carColor: String = ""
    var status: String = ""
    var fuelType: String = ""
    var typeMechanicalAutomatic: String = ""

    constructor(
        marcaName: String,
        carName: String,
        productionYear: Int,
        carColor: String,
        status: String,
        fuelType: String,
        typeMechanicalAutomatic: String,
    ) {
        this.marcaName = marcaName
        this.carName = carName
        this.productionYear = productionYear
        this.carColor = carColor
        this.status = status
        this.fuelType = fuelType
        this.typeMechanicalAutomatic = typeMechanicalAutomatic
    }


    fun identifyAge(): String = "Moshinani yoshi: ${2025- productionYear}"


    inner class Carmarket{
        var sellerName: String = ""
        var buyerName: String = ""
        var price: Double = 0.0

        constructor(sellerName: String, buyerName: String, price: Double) {
            this.sellerName = sellerName
            this.buyerName = buyerName
            this.price = price
        }

        fun formalizationProcess(): String = "Avtomabil sotuvchisini ismi: ${sellerName}.\nAvtomabilni sotib olgan insonni ismi: ${buyerName}.\nAvtomabil sotilgan narxi: ${price}$\nAvtomabil yoshi: ${identifyAge()}-yoshda.\nAvtomabil brandi: ${marcaName}.\nAvtomabil nomi: ${carName}.\nAvtomabil ishlab chiqarilgan yili: ${productionYear}.\nAvtomabil rangi: ${carColor}.\nAvtomabil holati: ${status}.\nAvtomabil yoqulg'i turi: ${fuelType}.\nAvtomabil skoriss turi (Mexnik yoki Avtomat): ${typeMechanicalAutomatic}"
    }
}