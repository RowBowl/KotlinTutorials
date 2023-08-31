import kotlin.math.ceil


fun main () {
    val list = listOf(1,2,3,4,5) //5,4,3,2,1
    val array = arrayOf(1,2,3,4,5)

    alternatingOrder(list) //1,5,2,4,3
    println("array: ")
    alternatingOrder(array)
}

fun alternatingOrder(collection: List<Int>){
    var i = 0
    var j = collection.size - 1
    var toggle = true

    while(i <= j){
        if(toggle) {
            println(collection[i])
            i++
        }
        else {
            println(collection[j])
            j--
        }
        toggle = !toggle
    }
}

fun alternatingOrder(collection: Array<Int>){
    var i = 0
    var j = collection.size - 1
    var toggle = true

    while(i <= j){
        if(toggle) {
            println(collection[i])
            i++
        }
        else {
            println(collection[j])
            j--
        }
        toggle = !toggle
    }
}


