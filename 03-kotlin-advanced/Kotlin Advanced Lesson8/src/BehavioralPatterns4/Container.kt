package BehavioralPatterns4

interface Container<T> {
    fun getIterator(): Iterator<T>
}