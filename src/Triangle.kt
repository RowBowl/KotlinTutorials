import kotlin.math.sqrt

class Triangle(
    val a: Double,
    val b: Double,
    val c: Double
): Shape("Triangle") {
    init {
        println("$name created with a = $a, b = $b, c = $c")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }
    override fun perimeter() = a + b + c

    override fun area() = sqrt((perimeter()/2) *((perimeter()/2) - a) * ((perimeter()/2) - b) * ((perimeter()/2) - c))

}