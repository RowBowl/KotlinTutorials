

fun main () {
    val sum =  alternatingSum(3,4,5,2,1,2,3)
    println("The alternating sum is $sum")

    val sum2 =  alternatingSum(2,3,7,3)
    println("The alternating sum is $sum2")
}

fun alternatingSum(vararg numbers: Int): Int {
    var sum = 0
    var switch = true
    var firstIsDone = false
    for(i in numbers) {
        if(!firstIsDone){ //don't set switch if it's the first element
            sum += i
            firstIsDone = true
        }
        else if(switch) {
            sum += i
            switch = false
        }
        else {
            sum -= i
            switch = true
        }
    }

    return sum
}