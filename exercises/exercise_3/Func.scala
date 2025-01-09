object Test extends App {
    
    val aList = List(1,2,3,4,5)
    println("-----"*20)
    println(aList.head)

    println("-----"*5)
    aList.tail.map(println)
    // aList.tail map println

    
    println("-----"*20)
    // Our matching pattern consists of two case. The first is our stop condition and we will match 
    // our list to Nil and the second, we break our list down into head and tail. We take the head 
    // and apply the som function to the tail of the list until we get to Nil where we return 0.
    def som(l:List[Int]) : Int = l match {
        case Nil => 0
        case head::tail => head + som(tail)
    }
    val sum = som(aList)
    println(s"Sum of elements: $sum")

    println("-----"*20)    
    // Create the rev function which returns the list in reverse order:
    def rev(l:List[Int]) : List[Int] = l match {
        case Nil => Nil 
        case head::tail => rev(tail):+head
    }    
    val reve = rev(aList)
    println(s"Reverse of elements: $reve")

    println("-----"*20)
    // Implement the last function which returns the last element of a list. If the list is empty, you 
    // will return -1 (Let's assume that our list only takes positive elements to be consistent). If you 
    // want to implement a "complete" last function you will need the Option type.
    def last(l:List[Int]) : Option[Int] = l match {
        case Nil => None
        case head::Nil => Some(head)    
        case head::tail => last(tail)
    }
    val last_ = last(aList)
    println(s"Last of elements: $last_")


}


// % scala Func.scala --main-class Fibonacci
// Compiling project (Scala 3.6.2, JVM (23))
// Compiled project (Scala 3.6.2, JVM (23))
// ----------------------------------------------------------------------------------------------------
// 1
// -------------------------
// 2
// 3
// 4
// 5
// ----------------------------------------------------------------------------------------------------
// Sum of elements: 15
// ----------------------------------------------------------------------------------------------------
// Reverse of elements: List(5, 4, 3, 2, 1)
// ----------------------------------------------------------------------------------------------------
// Last of elements: Some(5)