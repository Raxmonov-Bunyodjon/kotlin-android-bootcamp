package Topshiriq8

sealed class User {
    abstract val id: Int
    abstract val name: String

    data class Passenger(
        override val id: Int,
        override val name: String
    ) : User() {

        fun requestRide(origin: String, destination: String): Ride {
            println("$name taksini chaqirdi: $origin → $destination")
            // Bu yerda RideManager orqali safar yaratilishi mumkin
            return Ride(
                id = 0, // vaqtincha
                passenger = this,
                driver = Driver(999, "DriverNull"), // vaqtincha
                origin = origin,
                destination = destination,
                status = RideStatus.REQUESTED
            )
        }
    }

    data class Driver(
        override val id: Int,
        override val name: String
    ) : User() {

        fun acceptRide(ride: Ride) {
            println("$name buyurtmani qabul qildi!")
            ride.assignDriver()
        }

        fun driveTo(ride: Ride) {
            println("$name manzilga eltmoqda: ${ride.destination}")
            ride.completeRide()
        }
    }
}