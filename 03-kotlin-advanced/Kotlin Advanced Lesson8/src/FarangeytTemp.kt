class FarangeytTemp(var farengeyt: Double) : Temperature {
    override var temperature: Double
        get() = convertSelsiyFTo(farengeyt)
        set(value) {
            farengeyt = convertFToSelsiy(value)
        }

    private fun convertFToSelsiy(d: Double): Double {
        return (d - 32) * 5 / 9
    }

    private fun convertSelsiyFTo(d: Double): Double {
        return d * 9 / 5 + 32
    }


}


class SelsiyTemp(override var temperature: Double) : Temperature


interface Temperature {
    var temperature: Double
}