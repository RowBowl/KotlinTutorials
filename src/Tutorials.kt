

fun main () {
    println("Please enter a number: ")
    val input = readLine()?.toInt()

    if(input != null){
        if(input.isPrime())
            println("Input is a prime!")
        else
            println("Input is not a prime!")
    }
}

fun Int.isPrime(): Boolean{
    for(i in 2 until this-1){
         if(this % i == 0)//divisible by a number other than 1 and itself
             return false
    }
    return true

}
