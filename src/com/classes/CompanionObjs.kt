package com.classes

/*
No static methods
Can have singletons by using object keyword
Use a 'companion object' to get 'statics'

Object:
- can have properties, methods and initializers
- no constructor
- are actual objects and can be subclassed.
- they just cannot be instantiated more than once
- can be created inside another class

Companion object:
- used for factory objects and static methods
- not 'true' static, marke with @JvmStatic and java will see them that way
 */

class Person2 {
    companion object { // could implement interface or derive from other class here
        fun createUndergrade(name: String) {
            // etc
        }

        fun createPostgrad(name: String) {

        }
    }
}