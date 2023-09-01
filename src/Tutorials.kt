

fun main () {
    var customTriple = CustomTriple<Int, String, Boolean>(1, "test", true)
    customTriple.printTypes()
    println("Custom Triple: <${customTriple.first}, ${customTriple.second}, ${customTriple.third}>")
}