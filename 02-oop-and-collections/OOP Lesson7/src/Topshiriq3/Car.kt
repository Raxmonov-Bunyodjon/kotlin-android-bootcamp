package Topshiriq3
//O'zingiz istagan holda generic class yarating.
class Car<T, N, F, C, S, Y, P>(
    var brand: T,
    var name: N,
    var fuelType: F,
    var color: C,
    var status: S,
    var yearOfProduction: Y,
    var priceCar: P,
) {


    fun showInfo() {
        println("Moshinani brandi: ${brand},\nMoshinani nomi: ${name},\nMoshinani yoqilg'i turi: ${fuelType},\nMoshinani rangi: ${color},\nMoshinani holati: ${status},\nMoshinani ishlab chiqarilgan yili: ${yearOfProduction},\nMoshinani narxi: $priceCar")
    }
}