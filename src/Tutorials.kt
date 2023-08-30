

fun main () {
    val list = listOf(3,2,5,1,5,6,7)
    println("The list looks like the following: $list")
    println("Search for this number: ")
    val input = readLine()?.toInt()

    if(input != null){
        println("The index of $input is ${searchList(list, input)}")
    }
}

//fun searchList(list: List<Int>, input: Int): Int = list.indexOf(input)

fun searchList(list: List<Int>, input: Int): Int {
    for(i in 0 until list.size){ //use until when at least one of the range values is calculated
        if(list[i] == input){
            return i
        }
    }
    return -1
}
