
//==========================
// Companion Objects
//==========================

interface IdProvider {
    fun getId(): String
}

class Entity private constructor(val id: String) {
    companion object Factory : IdProvider {  // Great use if we are looking to have a private primary constructor
//        Have the ability to extend companion objects in similar way to classes
        override fun getId(): String {
            return "123"
        }
        const val id = "id"
//        fun create() = Entity("id")

        fun create() = Entity(getId())
    }
}

fun main() {
    val entity = Entity.Factory.create()
    Entity.id
}