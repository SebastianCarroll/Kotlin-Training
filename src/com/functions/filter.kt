package com.functions

fun main(args: Array<String>) : Unit {
    val ints = listOf(1, 2, 3, 4, 5)
    val smallInts = ints.filter { it < 4 }
    for(i: Int in smallInts) println(i)

    val sqrdInts = ints.map { it*it }

    printList(sqrdInts)

    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))

    // Input and output of map can be different types
    val titles = meetings.map { m ->  m.title }
    printList(titles)

    // Other fns like
    // all, any, count
    var allLarge = ints.all { it > 3 }

    // Can extract predicate for reuse however need to give types as cannot
    // be inferred and also must be passed as argument. (Which is technically happening but the
    // syntactic sugar hides that
    val greaterThanThree = { v:Int -> v > 3 }
    var anyLarge = ints.any(greaterThanThree)

    val countLarge = ints.count(greaterThanThree)

    val found = ints.find(greaterThanThree)
    // if found is null, means not found
    println(found)

    val nested = listOf(listOf(1,2,3), listOf(1,4,9))
    val allPlusOne = nested
        .flatMap { i -> i.map{ x -> x+1 } }
            // distinct relies on hashcode, works implicitly with data class
        .distinct()

    printList(allPlusOne)

    /*
    Downsides of using map/filter in this way is intermediate lists are created to hold the data
    Can use high amounts of memory if lists are large
    Use sequences for this case instead
     */
}

private fun <L> printList(sqrdInts: List<L>) {
    println(sqrdInts.joinToString())
}

class Meeting(val id: Int, val title: String) {
}