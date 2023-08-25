

fun main () {
    //let user enter 5 numbers. Average the numbers and display it on the console

    var userInputCount = 0
    var arrInputs = emptyArray<Float>()
    var sum = 0f
    while(arrInputs.count() < 5){
        val userInput = readlnOrNull()

        if(userInput.isNullOrBlank() || userInput.isEmpty()){
            println("Error: Please enter a number")
        }
        else if(!isNumeric(userInput)){
            println("Error: Please enter numeric values only")
        }
        else{
            arrInputs+= userInput.toFloat()
        }
    }

    for(i in arrInputs){
        sum += i
    }
    println("The average value of these numbers is: ${sum/5.0}")
}

fun isNumeric(toCheck: String): Boolean {
    val regex = "-?[0-9]+(\\.[0-9]+)?".toRegex()
    return toCheck.matches(regex)
}
