import kotlin.math.sqrt

class Triangle(
    val a: Double,
    val b: Double,
    val c: Double
) {
    init {
        println("Triangle created with a = $a, b = $b, c = $c")
        println("Triangle area is ${area()}")
        println("Triangle perimeter is ${perimeter()}")
    }
    fun perimeter() = a + b + c

    fun area() = sqrt((perimeter()/2) *((perimeter()/2) - a) * ((perimeter()/2) - b) * ((perimeter()/2) - c))

}