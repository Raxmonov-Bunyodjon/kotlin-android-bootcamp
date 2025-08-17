package StructuralPatterns5

fun main(args: Array<String>) {

    // Ob’ektlar
    val light = Light()
    val projector = Projector()
    val dvdPlayer = DvdPlayer()
    val soundSystem = SoundSystem()

    // Facade orqali boshqarish
    val cinema = CinemaFacade(light, projector, dvdPlayer, soundSystem)

    // Foydalanuvchi uchun oddiygina:
    cinema.watchMovie("Avengers: Endgame")
}