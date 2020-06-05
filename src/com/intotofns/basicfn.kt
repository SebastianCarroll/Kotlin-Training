package com.intotofns

// fun -> function declaration keyword
// connect -> name of fn
// addr: first param name
// String: first param type
// Boolean: return type
fun connect(addr: String) : Boolean {
    // here can call other fns
    return true
}

fun main(args: Array<String>) {
    connect("Test")
    println(max(1,2))
    log("Hello world" )
    // named parameters!
    log( level = 7, msg = "Hello log level of " )
}

// fun expressions!
// Reduces to a single line
fun max(a:Int, b:Int): Int = if (a > b) a else b

// default parameter here setting level to 1
// JVMOVerloads generates all the extra methods that allow variable number of params to be passed
@JvmOverloads
fun log(msg: String, level: Int = 1) {
    println("$msg logged at level $level")
}