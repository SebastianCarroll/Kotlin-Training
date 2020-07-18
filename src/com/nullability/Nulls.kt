package com.nullability

/*
Types are non-nullable by default
mark as nullable by appending a ?
Assigning null (or not checking if it is null) to a non-nullable variable is a compile time error

Meeting and Meeting? are different types and cannot be assigned to each other

Use the safe operator:
?.
is like an if
Says to call the method on the object if the object is not null

Elvis operator:
null-coalescing operator
?: is like an 'unless'
Says to do whatever is before the operator unless the object is null

Safe cast
as?

Casts to type or returns null
val v = o as? Interface

Not null assertions
!!
Very blunt instrument. Asserts that the var is not null
Only advantage is that it will throw at the assert and not later when we try to use the variable
Dubious as to how this is actually useful
 */

fun main(args: Array<String>) {
    // Must have nullable ? here
    var m:Meeting? = null
    var newMeeting = Meeting()

    // types are mismatched here:
    // newMeeting = m

    // Instead have to list what to do if it is null
    // which says assign m if m is not null otherwise create new meeting
    newMeeting = m ?: Meeting()

}

fun closeMeeting(m: Meeting): Boolean? {
    return if (m.canClose) m.close()
    else false
}

class Meeting {
    val canClose: Boolean = false
    fun close(): Boolean {
        return true
    }
}