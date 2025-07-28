# 💸 Expensive Product Finder

This Kotlin project demonstrates how to use object-oriented programming and collections to store and process a list of products, each with a name, store, and price. It includes functionality to find the most expensive product from the list.

## 📌 Features

- Define a `Price` class with product details.
- Store multiple products in an `ArrayList`.
- Iterate through the list to determine the most expensive product.
- Simple and clean Kotlin code with basic OOP principles.

## 🚀 How It Works

1. Products are stored as objects of the `Price` class.
2. The `ArrayList` stores all product objects.
3. A loop checks each product to find the one with the highest price.

### Example Output

Product name: Go'sht
Store name: Bozor
Price: 120000.0

kotlinda:


## 🧾 Code Snippet

```kotlin
data class Price(val productName: String, val storeName: String, val productPrice: Double)

fun main() {
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

    println("Product name: ${expensiveProduct.productName}")
    println("Store name: ${expensiveProduct.storeName}")
    println("Price: ${expensiveProduct.productPrice}")
}
🛠 Requirements
Kotlin compiler or IntelliJ IDEA

Basic knowledge of Kotlin and collections

📂 Project Structure

ExpensiveProductFinder/
├── Main.kt
└── README.md
📚 Keywords
Kotlin, OOP, ArrayList, Data Class, Find Max, For Loop, Collection Processing

👨‍💻 Author
Raxmonov Bunyodjon