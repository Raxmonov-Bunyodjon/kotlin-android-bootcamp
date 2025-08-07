package Topshiriq8

fun main(args: Array<String>) {
    // 1. Yo‘lovchi va haydovchi yaratish
    val yolovchi = User.Passenger(1, "Ali")
    val haydovchi = User.Driver(2, "Vali")

    // 2. RideManager orqali safar yaratish
    val rideManager = RideManager()
    rideManager.createRide(yolovchi, haydovchi, "Chilonzor", "Yunusobod")

    // 3. Birinchi safarni olish
    val safar = rideManager.rides[0]

    // 4. Haydovchi buyurtmani qabul qiladi
    haydovchi.acceptRide(safar)

    // 5. Haydovchi manzilga eltadi
    haydovchi.driveTo(safar)

    // 6. RideLogger orqali yozuvlar
    val logger = rideManager.RideLogger()
    logger.logAllRides()

    // 7. RideStatusHelper orqali status tekshirish
    val statusHelper = RideManager.RideStatusHelper()
    println("Safar yakunlanganmi? ${statusHelper.isFinal(safar.status)}")
}
