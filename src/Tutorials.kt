

fun main () {
    val age = readLine()?.toInt()

    //when your if/else statements depend on one variable, use when statements
    when(age){
        in 0..5 -> println("You're a young kid")
        in 6..17 -> println("You're a teenager")
        18 -> println("Finally, you're 18!")
        19, 20 -> println("You're a young adult")
        in 21..65 -> println("You're an adult")
        else -> println("You're really old")
    }
/*
    if(age in 0..5)
        println("You're a young kid")
    else if(age in 6..17)
        println("You're a teenager")
    else if(age == 18)
        println("Finally, you're 18!")
    else if(age == 19 || age == 20)
        println("You're a young adult")
    else if(age in 21..65)
        println("You're an adult")
    else
        println("You're really old")
        */
}
