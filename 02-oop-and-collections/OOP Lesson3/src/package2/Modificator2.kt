package package2

import package1.Modificator

class Modificator2: Modificator(){

    override var d: Int
        get() = super.d
        set(value) {}
}