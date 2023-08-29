

fun main () {
    //accept 5 numbers from the user. Print them in reverse order

    val list = mutableListOf<Int>()
    println("Please enter 5 numbers:")
    for(i in 1..5){
        val x = readLine()?.toInt()
        if(x != null)
            list.add(x)
    }
    println("The  5 numbers in reverse order are:")
    for(i in list.reversed()){
        println(i)
    }
}
