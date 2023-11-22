// variables are containers  for storing the data
// To create variables we use var and val and assign the value to it using the eaqual(=) sign
// var variablename = value
// val variablename = value

// the difference between var and val is that the variables declared with var keyword can be changed
// and modified where as val variables can not be changed once declared
// we not need to specify the data type in the kotlin language

fun main() {
    val fname = "Chenchu"
    var lname = "Reddy"
    val birthyear = 1998

    println(fname + " "+lname)
    println("I am born in the year of : "+ birthyear)
    lname = "Naidu"   // changed the lname as we can change the var variable
    println(fname + " "+lname)
}

// output :
// Chenchu Reddy
// I am born in the year of : 1998
// Chenchu Naidu