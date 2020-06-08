package com.intotofns

fun main(args: Array<String>) {
    val h1 = Header("H1")
    val h2 = Header("H2")

    val h3 = h1 plus h2

    println(h3.Name)

    val h4 = h1 + h2
    println(h4.Name)
}

class Header(var Name: String) {}

// Infix fn allows us to use like an operator
// Operator directive allows the overload of "+" not sure how it knows to overload + specifically?
// I don't see any directive. Maybe Plus name maps to +? Or maybe it knows because we use +?
infix operator fun Header.plus(other: Header) : Header {
    return Header(this.Name + other.Name)
}