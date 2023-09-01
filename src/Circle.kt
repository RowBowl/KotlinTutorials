import kotlin.math.PI
import kotlin.random.Random

class Circle(
    val radius: Double
) : Shape("Circle"){

    //functions inside the companion object don't need an instance to be called. Circle.functionName() is enough
    companion object {
        fun randomCircle(): Circle {
            val radius = Random.nextDouble(1.0,10.0)
            return Circle(radius)
        }
    }
    /*kotlin doesn't know which constructor to use since they are not unique
    constructor(diameter: Double): this(diameter/2) */

    init {
        println("$name created with radius = $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    override fun area() = radius * radius * ImportantNumbers.PI //only one instance of ImportantNumbers. Used over and over again

    override fun perimeter() = 2 * radius * ImportantNumbers.PI
}