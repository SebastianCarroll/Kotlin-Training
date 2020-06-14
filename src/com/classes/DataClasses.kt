package com.classes

/*
marked as data:
- override equals, hashCode and toString for us
- typically immutable
- easy copy method
 */

data class Meeting(val name: String, val location: String)

fun main(args: Array<String>) {
    val m1 = Meeting("1", "2")
    val m2 = Meeting("1", "2")

    val comp = if(m1 == m2) "Equal" else "Not equal"

    println(comp)
}