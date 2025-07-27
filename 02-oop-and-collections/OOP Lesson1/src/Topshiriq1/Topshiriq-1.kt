package Topshiriq1

fun main(args: Array<String>) {

    var user1 = Userinfo()
    user1.id = 1
    user1.name = "Raxmonov Bunyodjon"
    user1.username = "Bunyod22"
    user1.email = "raxmonovbunyodjon5081999@gmail.com"
    user1.address.street = "Yoshlik"
    user1.address.suite = "20-uy"
    user1.address.city = "Xovos"
    user1.address.zipcode = "120700"
    user1.address.geo.lat = "-37.223"
    user1.address.geo.lng = "83.1922"
    user1.phone = "+998997235955"
    user1.website = "kun.uz"
    user1.company.name = "Dunyo mebellari"
    user1.company.catchPhrase = "Mebel ishlab chiqariladi turli xil"
    user1.company.bs = "Haqiqiy vaqtda ishlaydigan joy"

    println("id: ${user1.id}")
    println("name: ${user1.name}")
    println("username: ${user1.username}")
    println("email: ${user1.email}")
    println("address_street: ${user1.address.street}")
    println("address_suite: ${user1.address.suite}")
    println("address_city: ${user1.address.city}")
    println("address_zipcode: ${user1.address.zipcode}")
    println("address_geo_lat: ${user1.address.geo.lat}")
    println("address_geo_lng: ${user1.address.geo.lng}")
    println("phone: ${user1.phone}")
    println("website: ${user1.website}")
    println("company_name: ${user1.company.name}")
    println("company_catchPhrase: ${user1.company.catchPhrase}")
    println("company_bs: ${user1.company.bs}")

}