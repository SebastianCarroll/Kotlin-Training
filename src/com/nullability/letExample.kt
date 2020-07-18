package com.nullability

/*
let is used to avoid explicit null chekcs
useful when passing nullable values
to fns expecting non-null values
 */

fun main(args: Array<String>) {
    var s: String? = null

    s = if(args.size >1) "hey you have args" else null
    // let is only called if s is not null, in which case let goes on to call
    // whatever is passed to it as a lambda
    s?.let { println(it) }
}