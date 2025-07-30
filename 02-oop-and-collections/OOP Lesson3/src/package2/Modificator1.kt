package package2

import package1.Modificator

class Modificator1: Modificator() {

    override var d: Int
        get() = super.d
        set(value) {}
}