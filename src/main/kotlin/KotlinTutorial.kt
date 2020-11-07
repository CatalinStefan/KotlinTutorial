/*
This is a
multiple line
comment
 */
fun main() {
//    This prints out a hello message

    var message = "Hello Alex!"
    println(message)
    message = "Hello Judy"
    println(message)

    println(message + " and John")

    var name1 = "Michael"
    var name2 = "Carol"
    println("Hello " + name1)
    println("Hello \"$name1\" and $name2")
    println("Hello\t \"$name1\" and $name2")

//    var 3cats = "cats"
    val myFirstVariableSorageUnit = "database"

    println("Length = ${name1.length}")

//    println("Please enter something:")
//    val userInput = readLine()
//    println("You said $userInput")

    val count = 5
    println(count * 3)

    var items = 3
    val population = 7_500_000_000
    val price = 29.99
    var pi = 3.14159f

    println("$items is ${items::class.java}")
    println("$population is ${population::class.java}")
    println("$price is ${price::class.java}")
    println("$pi is ${pi::class.java}")

    val price2: Float = 3f
    var newItems: Short = 8

    println("$newItems is ${newItems::class.java}")

    val newItemsFlost = newItems.toFloat()
    println(pi.toInt())
    println(pi.toString())

    println(3 + 6)
    println(3 - 6)
    println(3 * 6)
    println(3 / 6)
    println(10 % 3)
    println(++items)
    println(--newItems)

    pi += newItems
    println(pi)
    pi -= newItems
    println(pi)

    println(true && true)
    println(false || true)
    println(!true)

    println(5 >= 5)
    println(price == 29.99)
    println(price != 29.99)


    var catName: String? = null
//    catName = "Fluffy"
//    catName = null

    println(catName?.length?.toFloat())
    println(catName?:"No cat available")

//    println(catName!!.length)

    val animals = arrayListOf("cat", "dog", "hamster")
    println(animals)
    println(animals[2])
//    println(animals[3])

    val days = setOf("Monday", "Tuesday", "Monday")
    println(days)

    val dictionary = hashMapOf(Pair("one", "uno"), Pair("two", "dos"), Pair("three", "tres"))
    println(dictionary["two"])

    for (pet in animals) {
        println("I have a $pet")
    }

    for ((en, es) in dictionary) {
        println("$en in Spanish is $es")
    }

    if (5 > 3) {
        println("Math is easy")
    }

    for (pet in animals) {
        if (pet == "cat") {
            println("I don't have a $pet")
        } else if (pet == "dog") {
            println("Dogs are cute")
        } else {
            println("I have a $pet")
        }
    }

    for (pet in animals) {
        when (pet) {
            "cat" -> { println("I don't have a $pet") }
            "dog" -> { println("Dogs are cute") }
            else -> { println("I have a $pet") }
        }
    }

//    for (i in 1..10) {
//        print(i)
//        printMessage()
//    }

    val names = arrayListOf("Alice", "Bob", "Carol", "Dan")
    for (name in names) {
        printMessage(name)
    }

    val accountValues = arrayListOf(8765, 3628, 8475, 2635171, 3476)
    for (acc in accountValues) {
        println("$acc -> ${calculateAmount(acc)}")
    }
}

fun printMessage(person: String) {
    println("Hello $person")
}

//fun calculateAmount(value: Int): Int {
//    val result = value * 5 / 3 + 8 % 5 * 27
//    return result
//}

fun calculateAmount(value: Int) = value * 5 / 3 + 8 % 5 * 27