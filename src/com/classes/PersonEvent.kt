package com.classes

/*
used when you might have an enum and switch statement to decide on the course of action
you can now used a sealed class instead
 */
sealed class PersonEvent {
    class Awake: PersonEvent()
    class Asleep: PersonEvent()
    class Eating(val food: String): PersonEvent()
}

fun handlePersonEvent(event: PersonEvent) {
    when(event) {
        is PersonEvent.Awake -> println("awake")
        is PersonEvent.Asleep -> println("asleep")
        // implicitly casts even to Eating and can then call food on it
        is PersonEvent.Eating -> println(event.food)
        // Don't need else as there are only three possible options
        // we know all the options from the sealed class
    }
}