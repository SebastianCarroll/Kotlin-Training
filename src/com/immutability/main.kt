package com.immutability

import java.lang.NumberFormatException

fun main(args: Array<String>) {
    println("Hello world")
    // Vars - mutable
    // vals - cannot be reassigned ( The training says that vals are immutable but that isn't correct as the
    // objects themselves can be mutated, just the reference can't be changed)
    // Type inference here
    // Could be explicit like:
    // var q:Question = Question();
    // But is unnecessary here
    // Null checks - nothing can be null, unless explicitly allowed with the ? operator
    val q: Question? = Question()

    // Allowing q to be null, means we have to use the safe operator ?
    // Says if q is not null, then look for a property Answer, otherwise return null
    q?.Answer = "42" // can be reassigned/mutated
    // q.Question = "" // cannot me reassigned

    q?.display()

    // Must wrap in curly braces if complex. $will bind to q not to answer without the braces
    println("The answer to the ${q?.Question} is ${q?.Answer}")

    q?.printResult(q)

    val number:Int? = try {
        Integer.parseInt(q?.Answer)
    } catch (e:NumberFormatException) {
        null // could also be -1 etc. ANy default
    }

    println(number)
}

class Question {
    var Answer: String = ""
    val Question: String = "What ...?"
    val CorrectAnswer = "42"

    fun display() {
        // Java way:
        println("you said " + Answer)

        // Kotlin way with interpolation
        println("you said $Answer")
    }

    fun printResult(q: Question?) {
        when (Answer) {
            CorrectAnswer -> println("You were correct")
            else -> println("try again")
        }
    }
}