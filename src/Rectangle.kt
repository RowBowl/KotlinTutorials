import kotlin.random.Random

class Rectangle (
    val a: Double,
    val b: Double
): Shape("Rectangle"){

    //you can have multiple constructors using overloading
    //"this" revers to primary constructor above
    constructor(a: Double): this(a, a) //this constructor is for squares, which only have one value doubled for sides

    constructor(a: Int, b: Int): this(a.toDouble(),b.toDouble()) //if integer values are used during creation

    companion object{
        fun randomRectangle(): Rectangle {
            val a = Random.nextDouble(1.0, 10.0)
            val b = Random.nextDouble(1.0, 10.0)

            return Rectangle(a, b)
        }
    }
    init {
        println("$name created with a = $a and b =  $b")
    }

    override fun area() = a * b

    override fun perimeter() = 2 * a + 2 * b

    fun isSquare() = a == b
}