package StructuralPatterns5

// 🎯 Facade class
class CinemaFacade(
    private val light: Light,
    private val projector: Projector,
    private val dvdPlayer: DvdPlayer,
    private val soundSystem: SoundSystem,
) {
    fun watchMovie(movie: String) {
        println("🎬 Film boshlashga tayyorlanmoqda...\n")
        light.dim()
        projector.on()
        dvdPlayer.on()
        soundSystem.on()
        soundSystem.setVolume(8)
        dvdPlayer.play(movie)
        println("\n🍿 Kino boshlandi, maroqli tomosha qiling!")
    }
}