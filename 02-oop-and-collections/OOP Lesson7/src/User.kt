import kotlin.properties.Delegates

class User {

    var name: String by Delegates.observable("FIFA Game") {
        property, oldValue, newValue ->

        println(oldValue)
    }

}