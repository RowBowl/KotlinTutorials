

fun main () {
    var arr = listOf(1,2,3,4,5)
    println("The product of ${arr} is ${arr.product()}")
}

fun List<Int>.product(): Int{
    var product = 1
    for(i in this){
        product *= i
    }
    return product
}
