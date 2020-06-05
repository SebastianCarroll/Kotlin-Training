package com.gettingstarted

import java.lang.NumberFormatException
import java.util.*

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

    val number: Int? = try {
        Integer.parseInt(q?.Answer)
    } catch (e: NumberFormatException) {
        null // could also be -1 etc. ANy default
    }

    println(number)
    ranges()
}

fun ranges() {
    // Closed range from 1 to 10
    // Step wil skip every second
    for (i in 1..10 step 2) {
        println(i)
    }

    // Half closed range similar to java - will not go to 10, only 10 9
    for (i in 1 until 10) {
        println(i)
    }

    val ages = TreeMap<String, Int>()
    ages["Kevin"] = 55
    ages["Sam"] = 24
    ages["Alex"] = 24
    ages["Harry"] = 26

    // will iterate over the map and assign each
    // name, age to the vars and then print
    for ((name, age) in ages) {
        println("$name is $age years old")
    }

    // Using with index method on the actual collection
    // rather than using the old java for i = 0, ...
    val numbers = 1..10
    for((index, element)  in numbers.withIndex()) {
        println("$element at $index")
    }

    // Can have a range over anything that implements the comparable interface
    val range = 'a'..'z'
    range.forEach(::println)
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