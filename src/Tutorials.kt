

fun main () {
    //print n numbers of the fibbonaci sequence. n is inputted by the user
    println("Enter a number > 1: ")
    val userInput = readLine()?.toInt()

    val list = mutableListOf<Int>()
    if(userInput != null){
        for(i in 0..<userInput){
            if(i > 1){
                list.add(list[i-2] + list[i-1])
            } else{
                list.add(i)
            }
        }
    }
    println(list)
//[0,1,]
}
