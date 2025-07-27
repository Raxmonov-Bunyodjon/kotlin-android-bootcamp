# 📦 Kotlin JSON Data Model – `Userinfo` Example

This project demonstrates how to model a complex nested JSON structure into Kotlin classes using basic `class`, `var`, and object composition.

## 📑 Overview

We took the following JSON sample and translated it into Kotlin classes:

```json
{
  "id": 1,
  "name": "Leanne Graham",
  "username": "Bret",
  "email": "Sincere@april.biz",
  "address": {
    "street": "Kulas Light",
    "suite": "Apt. 556",
    "city": "Gwenborough",
    "zipcode": "92998-3874",
    "geo": {
      "lat": "-37.3159",
      "lng": "81.1496"
    }
  },
  "phone": "1-770-736-8031 x56442",
  "website": "hildegard.org",
  "company": {
    "name": "Romaguera-Crona",
    "catchPhrase": "Multi-layered client-server neural-net",
    "bs": "harness real-time e-markets"
  }
}
🧩 Kotlin Class Structure

kotlinda:

class GeoInfo {
    var lat: String = ""
    var lng: String = ""
}

class Address {
    var street: String = ""
    var suite: String = ""
    var city: String = ""
    var zipcode: String = ""
    var geo: GeoInfo = GeoInfo()
}

class CompanyInfo {
    var name: String = ""
    var catchPhrase: String = ""
    var bs: String = ""
}

class Userinfo {
    var id: Int = 0
    var name: String = ""
    var username: String = ""
    var email: String = ""
    var address: Address = Address()
    var phone: String = ""
    var website: String = ""
    var company: CompanyInfo = CompanyInfo()
}
🎯 Purpose
✅ Learn to break down nested JSON into separate Kotlin classes
✅ Understand object composition and initialization
✅ Prepare for working with APIs in Android development

📁 Project Structure

├── src/
│   ├── GeoInfo.kt
│   ├── Address.kt
│   ├── CompanyInfo.kt
│   ├── Userinfo.kt
├── README.md
🧠 What I Learned
How to use var and class in Kotlin

How to model nested objects

How to keep code clean and modular

📬 Contact
Telegram: @RaxmonovBunyodjon