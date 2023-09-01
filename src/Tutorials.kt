

fun main () {
    val circle1 = Circle(5.0)
    val circle2 = Circle(3.5)
    val triangle1 = Triangle(4.0, 4.0, 4.0)
    val triangle2 = Triangle(3.0, 3.0, 3.0)
    val rectangle1 = Rectangle(6.0)
    val rectangle2 = Rectangle(4.0, 3.0)

    var shapes = listOf(circle1, circle2, triangle1, triangle2, rectangle1, rectangle2)
    shapes = shapes.filter { it.area() > 20.0 }.sortedBy { it.area() }

    for (shape in shapes) {
        println("${shape.name}: Area: ${shape.area()}")
    }
}