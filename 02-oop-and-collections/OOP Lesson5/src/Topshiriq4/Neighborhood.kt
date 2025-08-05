package Topshiriq4

data class Neighborhood(
    var neighborhoodName: String,
    var district: String,
    var streetName: String,
    var shopsNumber: Int,
    var maneNumbers: Int,
    var houseCount: Int,
    var womenNumbers: Int,
    var hasSchool: Boolean,
    var hasClinic: Boolean,
    var hasPlayground: Boolean,
    var isAsphalted: Boolean
){
    fun totalPeople(): String = "${district}-Tumaning ${neighborhoodName}-Mahallaning va shu ${streetName}-ko'chasining aholi son ${maneNumbers+womenNumbers}ta"
}

