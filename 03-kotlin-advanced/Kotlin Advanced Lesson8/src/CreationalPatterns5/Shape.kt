package CreationalPatterns5

// Prototype interfeysi
interface Shape: Cloneable {

    fun draw()

    public override fun clone(): Shape
}