

fun main () {
    var toNum = 5
    sumTo(toNum)
    toNum = 7
    sumTo(toNum)
    toNum = 15
    sumTo(toNum)}

fun sumTo(toNum: Int){
    var result = 0
    for(i in 1..toNum){
        result += i
    }

    println("The sum of the values from 1 to $toNum is $result")

}
