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

    val text = "String     with multi \t space   "
    println(text.replaceMultipleWhitespace())
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

fun String.replaceMultipleWhitespace() : String {
    val regex = Regex("\\s+")
    // In an extension method, this refers to the object being passed in - which I think of loosely as the
    // right choice as 'this' would normally refer to the object the method is attached to, which makes sense
    return regex.replace(this, " ")
}