

fun main () {
    searchFor("How to use strings in kotlin")
    searchFor("How to use strings in java", "Bing") //overwriting default value
    searchFor(search="How to code", searchEngine = "Bing") //using named paramters, can be in any order

}


//hear, searchEngine paramter has a default value of "Google"
fun searchFor(search: String, searchEngine: String = "Google") {
    println("Searching for \"$search\" using $searchEngine")
}