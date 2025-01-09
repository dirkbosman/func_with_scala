object Test extends App {

    // The _ character will represent an element of the list and for each element we will see if it is greater than or equal to 8.
    println(s"-----"*20)
    println(List(10,2,6,7,8).filter(_ >= 8))
    
    // Create a list where each element is a tuple (x,1) with x an element of the list List(10,2,6,7,8).
    println(s"-----"*20)
    println(List(10,2,6,7,8).map((_,1)))


    val list = List(10, 2, 6, 7, 8)

    println(s"-----"*20)
    val result_1 = list.foldLeft(0) { (acc, elem) =>
    val intermediate_1 = (acc + elem) / 5
    println(s"Accumulated: $acc, Current: $elem, Intermediate Result: $intermediate_1")
    intermediate_1
    }
    // println(List(10,2,6,7,8).reduce((x:Int,y:Int)=>(x+y)/5))
    println(s"Final Result: $result_1")


    println(s"-----"*20)
    val result_2 = list.reduce { (x, y) =>
    val intermediate_2 = (x + y) / 2
    println(s"Reducing: $x and $y -> Intermediate Result: $intermediate_2")
    intermediate_2
    }
    // println(List(10,2,6,7,8).reduce((x:Int,y:Int)=>(x+y)/2)) // average of the list 
    println(s"Final Result: $result_2")


    println(s"-----"*20)
    // This is what we call a function factory to return functions within functions. This function will add 4 to 2.
    def factoryInc(inc:Int) = (x:Int) => x + inc
    println(factoryInc(4)(2))

    println(s"-----"*20)
    // It is also possible to initialise a constant by assigning it an anonymous function.
    val double = (x: Int) => x * 2
    val addThree = factoryInc(3)
    val addEight = factoryInc(8)
    println(double(2))
    println(addThree(4))
    println(addEight(2))

}

// % scala Book.scala
// Compiling project (Scala 3.6.2, JVM (23))
// Compiled project (Scala 3.6.2, JVM (23))
// ----------------------------------------------------------------------------------------------------
// List(10, 8)
// ----------------------------------------------------------------------------------------------------
// List((10,1), (2,1), (6,1), (7,1), (8,1))
// ----------------------------------------------------------------------------------------------------
// Accumulated: 0, Current: 10, Intermediate Result: 2
// Accumulated: 2, Current: 2, Intermediate Result: 0
// Accumulated: 0, Current: 6, Intermediate Result: 1
// Accumulated: 1, Current: 7, Intermediate Result: 1
// Accumulated: 1, Current: 8, Intermediate Result: 1
// Final Result: 1
// ----------------------------------------------------------------------------------------------------
// Reducing: 10 and 2 -> Intermediate Result: 6
// Reducing: 6 and 6 -> Intermediate Result: 6
// Reducing: 6 and 7 -> Intermediate Result: 6
// Reducing: 6 and 8 -> Intermediate Result: 7
// Final Result: 7
// ----------------------------------------------------------------------------------------------------
// 6
// ----------------------------------------------------------------------------------------------------
// 4
// 7
// 10