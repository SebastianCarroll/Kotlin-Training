package com.classes

/*
Primary constructors:


 */

// using var or val sets up name as a public property
class Human(var name: String)

// leaving it off means it wont set it up
// must to that with an alternative primary constructors:
class Human2(name: String){
    val name: String
    init {
        this.name = name
    }
}

class Human3(_name: String) {
    val name = _name
}

// but don't unless you have to make external calls or do
// transformation. Should prefer option 1

// Secondary constructors using constructor keyword
class Human4(val name: String) {
    // Use this to execute the primary constructor
    constructor(name: String, age: Int) : this(name)
}

// but also don't, prefer defaults:
class Human5(val name: String, val age: Int = 0)

// when inheriting, must call the default constructor if it exists
// not sure why

// Can use private constructors
// to inhibit construction - e.g. singleton
// better way in Kotlin not sure what yet