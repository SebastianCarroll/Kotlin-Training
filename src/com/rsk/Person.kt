package com.rsk

// Constructor syntax here - can pass in Name as the constructor parameter
// Public is the default behaviour for vars in constructors?
class Person (var Name: String) {

    // Public by default
    fun display() {
        println("Display: $Name")
    }

    fun displayWithLambda(func: (s:String) -> Unit) {
        func(Name)
    }

    // This is a parameter, where Kotlin will
    // generate the getters and setters under the hood
    var NameParam: String = ""
}