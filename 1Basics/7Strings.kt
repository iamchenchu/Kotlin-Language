// kotlin strings are used to store the text in a variable type string 
// string contains the collection of characters 

fun main()
{
    var greeting = "Hello"  // unlike java we no need to specify the type here, if u still want to specify then we can do it 
    var greeting1: String = "Hellow"

    println(greeting)

    println(greeting1)

    var age : Int
    age = 26
    println(age)

    //Accessing the string 
    var txt = "Chenchu Reddy"
    println(txt[0])
    println(txt[2]) 
    println("the length of the string is : "+ txt.length) // will print the total length of the word
    println(txt.toUpperCase())
    println(txt.toLowerCase())
    var txt2 = "Chenchu Reddy"
    println(txt.compareTo(txt2)) // outputs 0 they are equal
    println(txt.indexOf("Reddy")) //The indexOf() function returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):


}


