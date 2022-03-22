// Interface
// Def ->

interface PersonInfoProvider { // REMEMBER -> Interfaces CAN'T contain state
    val providerInfo : String

    fun printInfo(person:Person) {
        println("basicInfoProvider")
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId() : String
}

//Abstract -> Does not need to use all of the methods in interface
//abstract class BasicInfoProvider : PersonInfoProvider // Can use "abstract" but can't instantiate if used


open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider { // "Open" means you can inherit from class
//    override val printInfo(person: Person) {  // Override is needed in this
////        println("basicInfoProvider")
////        person.printInfo()
//    }
    override val providerInfo: String
        get() = "BasicInfoProvider"

    protected open val sessionIdPrefix = "Session"  // properties need to be opened just like classes need to be

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additonal print statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}

//fun main() {
//    val provider = FancyInfoProvider()
//
//
//    provider.printInfo(Person())
//    checkTypes(provider)
//}

//======================
// Object Expression
//=======================

fun main() {
    val provider = object : PersonInfoProvider { // Creating anonymous inner class
        override val providerInfo: String
            get() = "New Info Provider"

        fun getSessionId() = "id"
    }


    provider.printInfo(Person())
    provider.getSessionId()
    checkTypes(provider)
}




//================
// TYPE CHECKING AND SMART CASTS
//================

fun checkTypes(infoProvider: PersonInfoProvider) {
    if (infoProvider is SessionInfoProvider) {
        println("is a session info provider")
    } else{
        println("not a session info provider")
//        (infoProvider as SessionInfoProvider).getSessionId() // As -> Casts something to another type
//        infoProvider.getSessionId() // Was used as example of smart casting | Not working for me
    }
}

