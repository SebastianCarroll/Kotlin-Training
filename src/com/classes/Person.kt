package com.classes


fun main(args: Array<String>) {
    val s = Student()
    println(s)
}

abstract class Person {
    /* public, final by default (cannot be inherited if explicitly allowed to)
    * use open to allow inheritance
    * support abstract classes
    * -- abstract classes and functions
    * -- abstract fns must be implemented
    * -- open fns may be overridden
    * -- everything else cannot be overriden

    * Does not use packages for visibility scoping, just a way of collecting things together
    * Internal keyword - makes things visible to everything in that module, could be
    * a compilation module.
    *
    * sealed classes - 'enums on steroids', algebraic data types,
    * - used to restrict hierarchies
    * - sealed keyword
    * - define which classes can derive from class Event
    */
    var firstName: String = ""
    var lastName: String = ""

    open fun getName(): String = "$firstName $lastName" // *can* be overriden
    abstract fun getAddress(): String // must be overridden/implemeted
}

class Student : Person() {
    override fun getAddress(): String {
        return ""
    }
}