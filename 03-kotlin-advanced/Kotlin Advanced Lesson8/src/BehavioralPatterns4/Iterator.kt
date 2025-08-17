package BehavioralPatterns4

// Iterator interfeysi
interface Iterator<T> {
    fun hasNext(): Boolean
    fun next(): T
}