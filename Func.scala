// Here the reduce function takes the max function which takes two integers as arguments. 
// This function will be applied to the first two elements of the list which are 1 and 4, 
// we get 4. This value will be kept and we will compare it with another element of our 
// list and gradually reduce our initial list to a single value, which will be our maximum.

object Test extends App {

    def max(x:Int,y:Int) = if (x>y) x else y
    val l = List(1, 4, 6, 8, 6, 0, 8, 76, 90, 56, 9)

    println(s"-----"*20)
    println(l.reduce(max))
}

// % scala Book.scala
// Compiling project (Scala 3.6.2, JVM (23))
// Compiled project (Scala 3.6.2, JVM (23))
// ----------------------------------------------------------------------------------------------------
// 90