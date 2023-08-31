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

    fun area(): Double {
        val s = perimeter()/2.0
        val a = s * (s - a) * (s - b) * (s - c)
        val c = sqrt(a)
        return c
    }

}