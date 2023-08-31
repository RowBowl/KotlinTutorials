

fun main () {
    val myCircle = Circle(5.0)
    myCircle.changeName("ShapeA")
    println(myCircle.name)

    val myTriangle = Triangle(3.0, 3.0, 3.0)
    myTriangle.changeName("Susan")
    println(myTriangle.name)

    //val shape1 = Shape("test") //should not be able to instantiate this class. Objects should be specific shapes.
}
