package Topshiriq1

class GenericUser<N, A, G, B, C>(val name: N, val age: A, val gender: G, val birthday: B, val country: C) {

    fun AboutMe() {
        println("Ismim: ${name},\nYoshim: ${age},\nJinsim: ${gender}\nTug'ilgan kunim: ${birthday}\nMamlakatim: ${country}")
    }
}


