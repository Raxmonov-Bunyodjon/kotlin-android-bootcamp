package Topshiriq3

class Games(var gameName: String, var gamingDeviceName: String, var productedYear: Int, var sizeGame: Double){

    companion object{

        fun getInfo(): Games = Games("FIFA", "Laptop", 2025, 2000000.0)

        fun setInfo(gameName: String,gamingDeviceName: String,productedYear: Int,sizeGame: Double): Games =
            Games(gameName,gamingDeviceName,productedYear,sizeGame)
    }


    fun showInfo(){
        println("O'yin nomi: ${gameName},\nO'yin o'ynalayotgan qurilma nomi: ${gamingDeviceName},\nO'yin ishlab chiqarilgan yili: ${productedYear},\nO'yin xotira hajmi: ${sizeGame} MB ")
    }

    object Setub{
        private var setubName: String = ""
        private var setubSize: Double = 0.0
        private var ramSize: Int = 0


        fun setInfo(newsetubName: String, newsetubSize: Double, newramSize: Int){
            setubName = newsetubName
            setubSize = newsetubSize
            ramSize = newramSize
        }

        fun showInfo(){
            println("O'rnatiladigan o'yin sozlamalarini nomi: ${setubName},\nO'rnatiladigan o'yin hajmi: ${setubSize},\nO'rnatiladigan o'yining tezkor xotira hajmi: ${ramSize}")
        }

        fun clear(){
            setubName = ""
            setubSize = 0.0
            ramSize = 0
            println("Ma'lumotlar tozalandi!")
        }
    }
}