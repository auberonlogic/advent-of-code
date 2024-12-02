package org.match.scratch

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Hello, World!")
    // Hello, World!


    // BASIC TYPES

    val popcorn = 5     // There are 5 boxes of popcorn
    val hotgog = 7      // There are 7 hotdogs
    var customers = 10  // There are 10 customers in the queue

    // Some customers leave the queue
    customers = 8
    println(customers)
    // 8

    println("There are $customers customers.")
    println("There are ${customers + 2} customers when I add two to the customers template.")

    customers = customers + 3   // addition: 11
    customers += 7              // addition: 18
    customers -= 3              // subtraction: 15
    customers *= 2              // multiplication: 30
    customers /= 3              // division: 10

    println(customers) // 10

    // variable declared without initialization
    val d: Int
    // variable initialized
    d = 3

    // variable explicitly typed and initialized
    val e: String = "hello"

    // variables can be read because they have been initialized
    println(d) // 3
    println(e) // hello

    // Variable declared without initialization
    val f: Int

    // triggers an error when called
//    println(f) // Variable 'f' must be initialized




    // COLLECTIONS

    // LISTS

    // read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
    // [triangle, square, circle]

    // mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)
    // [triangle, square, circle]

    // to prevent a mutable list from accidentally being changed, can cast the mutable list as a read-only list
    val shapesLocked: List<String> = shapes
    println(shapesLocked)

    println("The first item in the list is ${readOnlyShapes[0]}")

    println("The first item in the list is ${readOnlyShapes.first()}")
    println("The last item in the list is ${readOnlyShapes.last()}")

    println("There are ${readOnlyShapes.count()} items in the list.")

    println("circle" in readOnlyShapes)
    // true

    shapes.add("pentagon")
    println(shapes)

    shapes.remove("square")
    println(shapes)


    // SETS
    // read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    // mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit)
    // [apple, banana, cherry]

    val lockedFruit: Set<String> = fruit

    println("There are ${lockedFruit.count()} different fruits in the set")

    println("banana" in lockedFruit) // true

    fruit.add("dragonfruit")
    println(fruit)

    fruit.remove("banana")
    println(fruit)


    // MAPS
    // read-only Map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)

    val lockedJuiceMenu: Map<String, Int> = juiceMenu
    println(lockedJuiceMenu)

    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")

    println("The value of pineapple juice is: ${readOnlyJuiceMenu["pineapple"]}")

    juiceMenu["coconut"] = 150
    println(juiceMenu)

    juiceMenu.remove("kiwi")
    println(juiceMenu)

    println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")

    println(readOnlyJuiceMenu.containsKey("kiwi")) // true

    println(readOnlyJuiceMenu.keys) // [apple, kiwi, orange]
    println(readOnlyJuiceMenu.values) // [100, 150, 100]

    println("orange" in readOnlyJuiceMenu.keys) // true
    println("orange" in readOnlyJuiceMenu) // true

    println(200 in readOnlyJuiceMenu.values) // false



    // CONTROL FLOW
    // CONDITIONAL EXPRESSIONS
    // IF
    val z: Int
    val check = true

    if (check) {
        z = 1
    } else {
        z = 2
    }

    println(z) // 1

    val y = 1
    val x = 2

    println(if (y > x) y else x) // returns 2


    // WHEN
    val obj = "Hello"

    // using 'when' as a statement (perform some action)
    when (obj) {
        // checks whether obj equals "1"
        "1" -> println("One")
        // checks whether obj equals "Hello"
        "Hello" -> println("Greeting")
        // default statement
        else -> println("Unknown")
    }
    // Greeting

    // using 'when' as an expression (sets some value)
    val result = when (obj) {
        // if obj equals "1", sets result to "one"
        "1" -> "one"
        // if obj equals "Hello", sets result to "Greeting"
        "Hello" -> "Greeting"
        // sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknown"
    }
    println(result)
    // Greeting

    // when does not need to be used with a subject
    val trafficLightState = "Red"

    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }
     println(trafficAction) // Stop

    // however, we CAN have the same code as above, but using trafficLightState as the subject
    val trafficActionWithSubject = when (trafficLightState) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficActionWithSubject) // Stop


    // LOOPS
    // FOR
    for (number in 1..5) {
        print("${number}, ")
    }

    println()

    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake")
    }


    // WHILE
    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++ // increment operator
    }


    // DO WHILE
    var pastriesEaten = 0
    var pastriesBaked = 0
    while (pastriesEaten < 3) {
        println("Eat a pastry")
        pastriesEaten++
    }
    do {
        println("Bake a pastry")
        pastriesBaked++
    } while (pastriesBaked < pastriesEaten)

    hello()

    println(sum(1,2))

    printMessageWithPrefix(prefix = "Log", message = "Hello")

    println()

    printMessageWithPrefixAndDefault("Hello", "Log")
    printMessageWithPrefixAndDefault("Hello")
    printMessageWithPrefixAndDefault(prefix = "Log", message = "Hello")

    println()

    printMessage("This is a message printed in a function with no return type or return statement, meaning the return type is 'Unit'.")

    println()

    println(sum2(3,5))

    println()

    println(registerUser("john_doe", "newJohn@example.com"))
    println(registerUser("new_user", "newUser@example.com"))

    println()

    // lambda function
    val upperCaseString = { text: String -> text.uppercase() }
    println(upperCaseString("hello"))

    // lambdas can be invoked on their own by adding parentheses () after the curly braces {} and including any parameters within the parentheses
    println()
    println("Lamdas can be invoked on their own adding the params in parens after the curly braces, like so... ")
    println({ text: String -> text.uppercase() } ("hello"))


    println()

    // lambda functions... pass to another function
    val numbers = listOf(1, -2, 3, -4, 5 , -6)

    // can pass the lambda directly in to the filter function
    val positives = numbers.filter { x -> x > 0 }

    val isNegative = { x: Int -> x < 0 }

    // can assign a lambda to a variable and pass the variable to the filter function
    val negatives = numbers.filter(isNegative)

    println(positives)
    println(negatives)

    println()

    // another good example is the map function to transform items in a collection
    val doubled = numbers.map { x -> x * 2 }

    val isTripled = { x: Int -> x * 3 }
    val tripled = numbers.map(isTripled)

    println(doubled)
    println(tripled)

    println()

    // function types
    val upperCaseStringWithType: (String) -> String = { text -> text.uppercase() }

    println(upperCaseStringWithType("hello"))

    println()

    // lambdas... return from a function
    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")

    // trailing lambda
    // the initial value is 0
    // The operation sums the initial value with every item in the list cumulatively
    println(listOf(1,2,3).fold(0, { x, item -> x + item })) // 6
    println(listOf(1,2,3).fold(0) { x, item -> x + item })  // 6
}

fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}

fun hello() {
    return println("HELLLLLLOOOOOO!!!!!!")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

// for conciseness, can use single expression functions

fun sum2(x: Int, y: Int) = x + y

fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

fun printMessageWithPrefixAndDefault(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun printMessage(message: String) {
    println(message)
}

val registeredUsernames = mutableListOf("john_doe", "jane_smith")

val registeredEmails = mutableListOf("john@example.com", "jane@example.com")

fun registerUser(username: String, email: String): String {
    // early return if the username is taken
    if (username in registeredUsernames) {
        return "Username already taken. Please choose a different username."
    }

    // early return if email is already registered
    if (email in registeredEmails) {
        return "Email already registered. Please use a different email."
    }

    // proceed with registration if the username and email are not taken
    registeredUsernames.add(username)
    registeredEmails.add(email)

    return "User registered successfully: $username"
}
