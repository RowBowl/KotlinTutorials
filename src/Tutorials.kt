

fun main () {
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    //The values within a list are immutable, but the values of an array are mutable
    array[0] = 3 //works fine
    //list[0] = 3 does not work

    //mutable list
    val mList = mutableListOf(1,2,3)
    mList[0] = 3

    //values can be inserted into the list
    mList.add(4)

    //lists can be directly printed
    println(mList)

    //values are removable from lists
    mList.remove(4)
    mList.removeAt(0)
    println(mList)


    val mList1 =  mutableListOf<Int>()
}
