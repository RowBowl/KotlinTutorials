

fun main () {
    var arr = arrayOf(3,5,2,10,7,1)
    var max = arr[0]
    for(i in arr){
        if(i > max){
            max = i
        }
    }
    println(max)
}
