package Topshiriq3

open class Person {
    private var name: String = ""
    private var address: String = ""

    constructor()

    constructor(name: String, address: String) {
        this.name = name
        this.address = address
    }

    open fun getName(): String = name
    open fun setName(name: String) {
        this.name = name
    }

    open fun getAddress(): String = address
    open fun setAddress(address: String) {
        this.address = address
    }

    override fun toString(): String {
        return "Person(name='$name', address='$address')"
    }
}