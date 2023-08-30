

fun main () {
    val max = getMax(1,2,3) //no need to pass in list, simplypass in as many numbers you want
    val max2 = getMax(4,3)
    val arr =  intArrayOf(55,43,2,1,2) //intArrayof uses vararg

    val max3 = getMax(1,3,44, *arr)

    println("Max 1 is $max")
    println("Max 2 is $max2")
    println("Max 3 is $max3")

}

fun getMax(vararg numbers: Int): Int {
    var max = numbers[0]
    for(number in numbers){
        if(number > max){
            max = number
        }
    }
    return max
}
