
var otherName = "Timmy" // var is read and write like let
//Notice above we did not specify a type = Type Inference

//var greeting: String? = null
// Question mark mean that value can be null | Type must be defined to use null


//fun main() {
//    greeting= "hello"
////    val greetingToPrint = if(greeting != null) greeting else "Hi"       // Keep greeting the same if not equal to null | if equal to null change to Hi
//
//    val greetingToPrint = when(greeting) {
//        null -> "Hi"
//        else -> greeting
//    }
//    println(greetingToPrint)
//
////    IF STATEMENT
////    if (greeting != null) {   // If statements are very similar to JavaScript if statement
////        println(greeting)
////        println(otherName)
////    } else {
////        println("Wassup")
////    }
//   val name: String = "David" // Val is read only keyword like const
//    otherName = "Tommy"
//
////   WHEN STATEMENT
////    when(greeting) { // Similar to switch in java
////        null -> println("Hi") // Define what that value of thing in parentheses is and the result you want
////        else -> println(greeting)
////    }
//
//
//
//// Declare a constant variable
//    val car: String? = null
//
////  Declare a changing variable
//    var myCar = "Chevy"
//
////    Write an if statement
//    if (car == "Tesla") {
//        println("Nice ride")
//    } else {
//        println("Thanks for the ride")
//    }
//
////    Write a when statement
//    when(myCar) {
//        "Chevy" -> println("Red Beau")
//        else -> println("That's not my car!")
//    }
//
//
//}


//fun getGreeting(): String = "Hello Kotlin" // Can have single line functions
//fun getGreeting() = "Hello Kotlin" // Same as the code above without String declaration
//
//fun sayHello(): Unit {  // Unit means there is no useful data type | Function can have type inference as well
//    println(getGreeting())
//}

//fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")
////    val msg = "Hello $itemToGreet"
//
//
//fun getARide() {
//    println("Can I get a ride?")
//}
//
//fun respondToAsk(): String = "No"
//fun respondToAskTwo():String {
//    return "Yes"
//}
//
//fun add(num1:Int, num2:Int): Int {
//    return num1 + num2
//}
//
//fun main() {
//    sayHello(greeting = "Hey", itemToGreet = "Kotlin")
//    sayHello(greeting = "Hello", itemToGreet = "World")
//    println(add(num1 = 2, num2 = 6))
//}




//================================
// COLLECTION (Difference between Arrays and Lists : https://stackoverflow.com/questions/36262305/difference-between-list-and-array-types-in-kotlin)
// =================================


// By default collections in Kotlin are immutable | can not add more value to it.
//You will need to specify that the list is mutable


//fun sayHello(greeting:String, itemsToGreet:List<String>) { // Called on line 138
//    itemsToGreet.forEach {itemToGreet ->
//        println("$greeting $itemToGreet")
//    }
//
//
//}
//fun main() {
//
////    ARRAY
////    val interestingThings = arrayOf("Kotlin", "Programming", "Manga")
////    println(interestingThings.size)
////    println(interestingThings[0])
////    println(interestingThings.get(0))
////
        // FOR LOOP
//////    for ( interestingThing in interestingThings) {
//////        println(interestingThing)
//////    }

//////    interestingThings.forEach {
//////        println(it) //Use it to specify each individual thing
//////    }
//////    CAN ALSO BE WRITTEN LIKE ...
////    interestingThings.forEach { interestingThing ->
////        println(interestingThing)
////    }
////
//////    If you want index of array...
////    interestingThings.forEachIndexed { index, interestingThing ->
////        println("$interestingThing is at index $index")
////    }
//
////    LISTS
//
////    val interestingThings = listOf("Kotlin", "Programming", "Anime")
//    val interestingThings = mutableListOf("Kotlin", "Programming", "Anime")
//    interestingThings.add("Puppies")
////    interestingThings[0]
//    interestingThings.forEach{ interestingThing ->
//        println(interestingThing)
//    }
//
//    sayHello(greeting = "Hi", interestingThings)
//
//
////    MAP - Similar to objects in JavaScript
////    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
//    val map = mutableMapOf(1 to "a", 2 to "b", "three" to "c")
//    map.forEach { key, value -> println("$key -> $value")  }
//
//    println(map)
//
//}



//======================
// Vararg, Named arguments & default parameter values
//======================


//VARARG
//Using vararg to take a variable number of string arguments including none
fun sayHello(greeting:String, vararg itemsToGreet:String) { //Vararg = Variable number of arguments | Array is expected
    itemsToGreet.forEach {itemToGreet ->
        println("$greeting $itemToGreet")
    }


}
//fun main() {
//    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
////    sayHello(greeting= "hi", listOf())
//
////    HARD CODE EXAMPLE
//    sayHello(greeting = "Hi", "Kotlin", "Programming", "Anime" )  // Using vararg to pass in variable number of arguments
////    USING EXISTING COLLECTION
//    sayHello(greeting = "Hello", *interestingThings)
//
//}

//NAMED ARGUMENTS

//fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name") // Can add default values in order to omit arguments once called
//fun main() {
//    greetPerson(greeting = "hi", name="David") // When using equals sign here, you can change the order of the arguments  as long as they are there
//    // MUST TAKE BOTH ARGUMENTS IF DEFAULT VALUES ARE NOT PROVIDED
//
//    greetPerson()  // This will return --> Hello Kotlin
//
////LIMITATION --> IF ONE THING IS NAME, ALL MUST BE NAMED
//
//
//
//}


//======================================
// CLASSES
//======================================

fun main() {
    val person = Person()  // Calling Person class from other file | DO NOT NEED NEW KEYWORD
    person.lastName
    person.firstName
    person.middleName
    person.printInfo()

    person.nickName = "Shades"
    person.nickName = "NewNickname"
    println(person.nickName)

}