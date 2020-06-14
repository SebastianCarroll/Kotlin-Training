package com.classes


fun main(args: Array<String>) {
    val p = Person()
    println(p)
}

class Person {
    /* public, final by default (cannot be inherited if explicitly allowed to)
// use open to allow inheritance
// support abstract classes
// Sealed class
// Class constructors
// data classes
*/
    var firstName:String =""
    var lastName:String =""

    open fun getName() :String ="$firstName $lastName"
}

