package com.immutability

fun main(args: Array<String>) {
    println("Hello world")
    // Vars - mutable
    // vals - cannot be reassigned ( The training says that vals are immutable but that isn't correct as the
    // objects themselves can be mutated, just the reference can't be changed)
    // Type inference here
    // Could be explicit like:
    // var q:Question = Question();
    // But is unnecessary here
    var q = Question()

    q.Answer = "42" // can be reassigned/mutated
    // q.Question = "" // cannot me reassigned

    q.display()

    // Must wrap in curly braces if complex. $will bind to q not to answer without the braces
    println("The answer to the ${q.Question} is ${q.Answer}")

    // If/else is expression in Kotlin
    val message = if(q.Answer == q.CorrectAnswer) {
        "You were correct"
    } else {
        "try again"
    }

    println(message)
}

class Question {
    var Answer:String = ""
    val Question:String = "What ...?"
    val CorrectAnswer = "42"

    fun display() {
        // Java way:
        println("you said " + Answer)

        // Kotlin way with interpolation
        println("you said $Answer")
    }
}