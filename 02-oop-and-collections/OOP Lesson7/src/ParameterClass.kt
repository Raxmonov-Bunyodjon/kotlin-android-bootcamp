class ParameterClass<A>(private var value: A) {

    fun getValue(): A {
        return value
    }

    fun setValue(value: A) {
        this.value = value
    }


}


