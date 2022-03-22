//NEW FILE MADE FOR CLASS
// () == Primary COnstructor


//class Person ( _firstName: String, val middleName: String, _lastName: String) { // Can also initialize in constructor itself
//    val firstName: String = _firstName // Can also initialize by assigning directly
//    val lastName: String  // Must be initialize
//
//    init { // Piece of code run every time class is run | Can have multiple ones
//
//        lastName = _lastName
//        println("init 1")
//    }
//
//    constructor(): this("Peter", "Jamie", "Parker") { // Secondary constructors will be called after init blocks
//        println ("secondary constructor")
//    } // NOTE: CAN ADD DEFAULT VALUES IN CONSTRUCTOR IN PLACE OF secondary constructor
//
//    init{
//        println("init 2")
//    }
//}

class Person (val firstName:String = "Peter", val middleName: String = "James", val lastName: String = "Parker" ) {
    var nickName: String? = null

        set(value) { // To override set property
            field = value
            println("the new nickname is $value")
        }

        get() {
            println("the returned value is $field")
            return field
        }
    fun printInfo() {
//        val nickNameToPrint = if(nickName != null) nickName else "no nickname"
        val nickNameToPrint = nickName ?: "no nickname" // Using elvis operator == if what is on left is not null return that otherwise return the right side expression
        println("$firstName ($nickNameToPrint) $lastName")
    }
    // If property is val will have getter generated
//    If property is var --> Will have getter and setter generated
}