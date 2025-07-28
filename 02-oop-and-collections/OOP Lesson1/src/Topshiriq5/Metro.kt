package Topshiriq5

class Metro (

    var departureStation: String,
    var destinationStation: String,
    var travelTime: Int,
    var lineNumber: Int
)  {
    override fun toString(): String {
        return "Metro(line=$lineNumber, from='$departureStation', to='$destinationStation', time=$travelTime)"
    }}