

fun main () {
    val pow = printPow(3, 5)
    //println("3 to the power of 5 is $pow")
    //println(multiply(3,5))
    println(printFirstItem(listOf(1,2,3)))
}

fun printPow(base: Int, exponent: Int): Int {
    var result = 1
    for(i in 1..exponent){
        result *= base
    }
    return result
}

//one-line functions
fun multiply(a:Int, b: Int) = a * b

fun printFirstItem(list: List<Int>) =  println(list[0])