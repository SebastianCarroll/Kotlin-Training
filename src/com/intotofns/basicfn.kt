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
}

// fun expressions!
// Reduces to a single line
fun max(a:Int, b:Int): Int = if (a > b) a else b