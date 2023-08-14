

fun main () {
    //println("hello world")

    //"Int" optional
    //var myVariable: Int = 5
    var myVariable = 5
    println(myVariable)
    //$ before word in a string will interpolate the value of a variable by that name
    myVariable += 1
    println("The value of my variable is: $myVariable")

    val myConstantVariable = 5
    println("My constant variable is: $myConstantVariable")

    var myBooleanVariable = true
    println("My boolean variable is: $myBooleanVariable")

    var x = 5
    var y = 7
    println("The sum of $x and $y is ${x+y}")

    var xDecimal: Float = 5F
    var yDecimal = 10F
    println(xDecimal)
    println(xDecimal/yDecimal)

    var myStringVariable = "stRing variabEe TEST"
    println(myStringVariable.uppercase().lowercase())
}
