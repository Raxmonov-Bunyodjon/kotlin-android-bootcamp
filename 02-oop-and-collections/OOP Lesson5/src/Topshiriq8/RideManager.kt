package Topshiriq8

class RideManager {//Safar boshqaruvchisi

    var rides: MutableList<Ride> = mutableListOf()

    fun createRide(passenger: User.Passenger, driver: User.Driver, origin: String, destination: String) {
        val rideId = rides.size + 1
        val newRide = Ride(
            id = rideId,
            passenger = passenger,
            driver = driver,
            origin = origin,
            destination = destination,
            status = RideStatus.REQUESTED
        )
        rides.add(newRide)
        println("Yangi safar yaratildi. ID: $rideId")
    }

    fun getAllRides() {
        if (rides.isEmpty()) {
            println("Hali hech qanday safar yo‘q.")
        } else {
            println("Barcha safarlar ro'yxati:")
            for (ride in rides) {
                println("ID: ${ride.id}, ${ride.passenger.name} → ${ride.destination}, Holat: ${ride.status}")
            }
        }
    }


    inner class RideLogger {
        fun logAllRides() {
            println("=== Barcha safar yozuvlari ===")
            for (ride in rides) {
                println("Safar #${ride.id}: ${ride.passenger.name} → ${ride.destination} | Holat: ${ride.status}")
            }
        }
    }

    class RideStatusHelper {
        fun isFinal(status: RideStatus): Boolean {
            return status == RideStatus.COMPLETED
        }
    }
}
