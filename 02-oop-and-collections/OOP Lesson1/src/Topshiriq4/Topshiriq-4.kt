package Topshiriq4

fun main(args: Array<String>) {
    val productList = ArrayList<Price>()

    productList.add(Price("Banan", "Supermarket", 24000.0))
    productList.add(Price("Go'sht", "Bozor", 120000.0))
    productList.add(Price("Yog'", "Bozor", 18000.0))
    productList.add(Price("Shakar", "Supermarket", 17000.0))
    productList.add(Price("Olma", "Supermarket", 20000.0))

    var expensiveProduct = productList[0]

    for (item in productList) {
        if (item.productPrice > expensiveProduct.productPrice) {
            expensiveProduct = item
        }
    }
    println("Eng qimmat mahsulot: ${expensiveProduct.productName}, " +
            "Do'kon: ${expensiveProduct.shopName}, " +
            "Narxi: ${expensiveProduct.productPrice} so'm")
}

