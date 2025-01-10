package exercise_4

object TestSuite {

  def main(args: Array[String]): Unit = {
    println("=== Running Tests ===")

    println("------"*20)
    println("Testing Fruit class:")
    val apple = new Fruit("Apple")
    val banana = new Fruit("Banana")
    assert(apple != banana, "Test 1 Failed: apple != banana")
    assert(apple == new Fruit("Apple"), "Test 2 Failed: apple == new Fruit(\"Apple\")")
    println("Fruit class tests passed.")

    println("------"*20)
    println("Testing Juice class:")
    val orangeJuice = new Juice("Orange", 500)
    val appleJuice = new Juice("Apple", 250)
    assert(orangeJuice != appleJuice, "Test 3 Failed: orangeJuice != appleJuice")
    assert(orangeJuice == new Juice("Orange", 500), "Test 4 Failed: orangeJuice == new Juice(\"Orange\", 500)")
    println("Juice class tests passed.")

    println("------"*20)
    println("Testing VendingMachine class:")
    val vendingMachine = new VendingMachine(10)
    println("\nBoolean Tests:")
    println(new Fruit("Apple") == new Fruit("Apple")) // Should print true
    println(new Juice("Orange", 500) == new Juice("Orange", 500)) // Should print true
    println(new Juice("Orange", 500) == new Juice("Apple", 250)) // Should print false
    println("\nAdd Products:")
    vendingMachine.add(apple)       // Adds Apple (Fruit)
    vendingMachine.add(banana)      // Adds Banana (Fruit)
    vendingMachine.add(orangeJuice) // Adds Orange Juice (Juice)
    vendingMachine.add(appleJuice)  // Adds Apple Juice (Juice)
    
    println("------"*20)
    println("Vending Machine State After Additions:")
    println(vendingMachine)
    
    println("------"*20)
    println("Remove Products:")
    vendingMachine.remove(apple)  // Removes Apple (Fruit)
    vendingMachine.remove(new Juice("Grape", 300)) // Tries to remove non-existent product
    
    println("------"*20)
    println("Final Vending Machine State After Removals:")
    println(vendingMachine)

    println("------"*20)
    println("Final Assertions:")
    assert(vendingMachine.toString.contains("Banana"), "Test 5 Failed: Banana should still be present")
    assert(!vendingMachine.toString.contains("Fruit: Apple"), "Test 6 Failed: Fruit: Apple should be removed")
    
    println("------"*20)
    println("VendingMachine class tests passed.")
    println("All tests passed successfully.")
    println("------"*20)
  }
}


// % scala *.scala
// Compiling project (Scala 3.6.2, JVM (23))
// Compiled project (Scala 3.6.2, JVM (23))
// === Running Tests ===
// ------------------------------------------------------------------------------------------------------------------------
// Testing Fruit class:
// Fruit class tests passed.
// ------------------------------------------------------------------------------------------------------------------------
// Testing Juice class:
// Juice class tests passed.
// ------------------------------------------------------------------------------------------------------------------------
// Testing VendingMachine class:

// Boolean Tests:
// true
// true
// false

// Add Products:
// Adding Fruit: Apple
// Adding Fruit: Banana
// Adding Juice: Orange
// Adding Juice: Apple
// ------------------------------------------------------------------------------------------------------------------------
// Vending Machine State After Additions:
// Current products list in toString: List(Fruit: Apple, Fruit: Banana, Juice: Orange, Juice: Apple)
// Vending machine has 4 space left
// It contains: Fruit: Apple; Fruit: Banana; Juice: Orange; Juice: Apple
// ------------------------------------------------------------------------------------------------------------------------
// Remove Products:
// Initial products list: List(Fruit: Apple, Fruit: Banana, Juice: Orange, Juice: Apple)
// Trying to remove: Fruit: Apple
// Updated products list: List(Fruit: Banana, Juice: Orange, Juice: Apple)
// Fruit: Apple deleted
// Initial products list: List(Fruit: Banana, Juice: Orange, Juice: Apple)
// Trying to remove: Juice: Grape
// Updated products list: List(Fruit: Banana, Juice: Orange, Juice: Apple)
// Juice: Grape not found
// ------------------------------------------------------------------------------------------------------------------------
// Final Vending Machine State After Removals:
// Current products list in toString: List(Fruit: Banana, Juice: Orange, Juice: Apple)
// Vending machine has 5 space left
// It contains: Fruit: Banana; Juice: Orange; Juice: Apple
// ------------------------------------------------------------------------------------------------------------------------
// Final Assertions:
// Current products list in toString: List(Fruit: Banana, Juice: Orange, Juice: Apple)
// Current products list in toString: List(Fruit: Banana, Juice: Orange, Juice: Apple)
// ------------------------------------------------------------------------------------------------------------------------
// VendingMachine class tests passed.
// All tests passed successfully.
// ------------------------------------------------------------------------------------------------------------------------