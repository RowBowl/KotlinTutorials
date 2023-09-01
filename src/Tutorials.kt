

fun main () {
    var list = (1..10).toList()
    val sum = list.customSum { it % 2 == 1}

    println("The sum is: $sum")
}

fun List<Int>.customSum(sumFunction: (Int) -> (Boolean)): Int {
    var sum = 0
    for(i in this){
        if(sumFunction(i)) {
            sum += i
        }
    }
    return sum
}