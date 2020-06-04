import com.rsk.Person

fun main(args: Array<String>) {
    println("Hello, world!")

    val kevin = Person("Default Name")

    println("Name is ${kevin.Name}")

    kevin.Name = "Steve"

    kevin.display()

    // Prefix with :: to indicate function reference
    kevin.displayWithLambda(::printName)
}

fun printName(name: String) {
    println(name)
}