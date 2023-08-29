

fun main () {
    val list = mutableListOf<Int>()
    for(i in 1..10){
        val userInput = readLine()?.toInt()

        if(userInput != null){
            list.add(userInput)
        }
    }

    println(list)
}
