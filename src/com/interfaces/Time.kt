package com.interfaces

interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0)
    fun setTime(time: KevinTime) = setTime(time.hours)
}

class KevinTime {
    var hours: Int = 0
    var minutes: Int = 0
    var seconds: Int = 0
}

// THis will break here as there are no overrides of second set time method,
// Use default methods to evolve an interface
class YetiTime : Time {
    override fun setTime(hours: Int, mins: Int, secs: Int) {
        TODO("Not yet implemented")
    }
}

interface A { fun doSomething() = {}}
interface B { fun doSomething() = {}}

class For : A, B {
    override fun doSomething(): () -> Unit {
        // Multiple interfaces with the same method at this point
        // can reference the super to call explicitly
        return super<A>.doSomething()
    }
}