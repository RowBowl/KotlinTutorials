abstract class Shape( //abstract classes are only for other classes to inherit from. No object instantiation
    var name: String
    //every shape has an area and perimeter, but the calculation of these values differ between the types of shapes
) {

    constructor(name: String, vararg dimensions: Double): this(name)
    init {
        println("I am the super class!")
    }
    //no need to implement abstract functions. Implementation differs between inherited classes
    //if you inherit shapes, you need to implement all abstract functions
    abstract fun area(): Double

    abstract fun perimeter(): Double

    fun changeName(newName: String){
        name = newName
    }
}