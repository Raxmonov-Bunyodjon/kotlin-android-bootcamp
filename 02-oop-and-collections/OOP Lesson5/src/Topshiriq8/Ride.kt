package Topshiriq8

data class Ride(
    var id: Int,
    var passenger: User.Passenger,   //yo'lovchi
    var driver: User.Driver,         //haydovchi
    var origin: String,         //boshlanish
    var destination: String,    //manzil tugash ya'ni
    var status: RideStatus      //holat
){

    fun assignDriver() {                              //haydovchinibiriktirish
        if (status == RideStatus.REQUESTED) {
            // statusni o'zgartirish
            status = RideStatus.ASSIGNED
            println("Haydovchi biriktirildi: ${driver.name}")
        } else {
            println("Haydovchi biriktirib bo‘lmaydi. Hozirgi holat: $status")
        }
    }

    fun completeRide(){                        //safarni yakunlash
        if (status == RideStatus.ASSIGNED || status == RideStatus.ONGOING) {
            status = RideStatus.COMPLETED
            println("Safar yakunlandi. Manzilga yetib keldik: $destination")
        } else {
            println("Safarni yakunlab bo‘lmaydi. Hozirgi holat: $status")
        }
    }

}


