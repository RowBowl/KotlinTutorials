import java.lang.NumberFormatException


fun main () {
    val division = try {
        divide(5.0, 0.0)
    } catch (e: DivisionByZeroException) {
        0.0
    }

    println(division)
    //exceptions are used to detect and handle runtime errors before they crash our program

    //when providing string "hello" into the toInt() function, the toInt() function throws an NumberFormatException
    /*Exception in thread "main" java.lang.NumberFormatException: For input string: "hello"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:665)
	at java.base/java.lang.Integer.parseInt(Integer.java:781)
	at TutorialsKt.main(Tutorials.kt:5)
	at TutorialsKt.main(Tutorials.kt)*/

    println("Please enter a number: ")
    //val input = readLine()?.toInt() //ctrl + q to see details of a function and exceptions it can throw
    val input = try{
        readLine()?.toInt()
    } catch (e: NumberFormatException) { //all exceptions are just classes that inherit super class "Exception"
        0
    } finally {
        //this block executed in ALL cases (whether conversion was fine or an exception was thrown
        println("This is from the finally block")
    }
    println("You entered: $input")

    val circle = Circle(-3.0)

}

class DivisionByZeroException: Exception("You cannot divide by zero. Please choose a different denominator.")
fun divide(a: Double, b: Double): Double {

    if(b == 0.0)
        throw DivisionByZeroException()

    return a / b

}