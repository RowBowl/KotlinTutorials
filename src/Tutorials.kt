

fun main () {
    val a = 3.0
    val b = 4.0
    val c = 5.0
    val d = 6.0
    val height = 2.0
    val parellelogram = object: Shape("Parellelogram", a, b, height){

        init {
            println("Parellogram created with a = $a, b = $b, and height = $height")
            println("The area is ${area()}")
            println("The perimeter is ${perimeter()}")
        }
        //this is basically an anonymous class that inherits from shape
        override fun area(): Double {
            return a * height
        }

        override fun perimeter(): Double {
            return 2 * a + 2 * b
        }

        fun isRectangle(): Boolean = height == b
    }

    println("Is the parellelogram a rectangle? ${parellelogram.isRectangle()}")

    val trapezoid = object: Shape("Trapezoid", a, b, c, d, height) {
        init {
            println("Trapezoid created with a = $a, b = $b, c = $c, d = $d, and height = $height")
            println("The area is ${area()}")
            println("The perimeter is ${perimeter()}")
        }

        override fun area(): Double {
            return ((a + b)/2) * height
        }

        override fun perimeter(): Double {
            return a + b + c + d
        }

        fun isRectangle(): Boolean = height == b

    }
    println("Is the trapezoid a rectangle? ${parellelogram.isRectangle()}")

}
