class Circle(
    val radius: Double
) : Shape("Circle"){
    private val pi = 3.141592

    /*kotlin doesn't know which constructor to use since they are not unique
    constructor(diameter: Double): this(diameter/2) */

    init {
        println("$name created with radius = $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    override fun area() = radius * radius * pi

    override fun perimeter() = 2 * radius * pi
}