package package1

open class Modificator {

    //publik
    var a = 17

    private var b = 20


    internal var c = 27


    protected open var d = 35
//        get() = field
//        set(value) {
//            field = value
//        }
    fun setB(value: Int){
        this.b = value
    }

    fun getB(): Int{
        return b
    }

}