// The infTen function returns true if the integer given as an argument is less than 10, 
// so for each element of the collection list, if we get true with infTen at the element 
// then that element is kept in the list returned by the filter function.

object Test extends App {

    def infTen(x:Int): Boolean = x < 10 
    def odd(x:Int): Boolean = x % 2 != 0
    
    val collection = List(1, 4, 6, 8, 6, 0, 8, 76, 90, 56, 9, 3)
    val filter = collection.filter(infTen)
    val filter_and_sorted = filter.sorted
    val filter_and_sorted_2 = collection.filter(_ < 10).sorted

    println(s"-----"*20)
    collection.map(println)

    println(s"-----"*20)
    filter.map(println)
    
    println(s"-----"*20)
    println(filter_and_sorted)
    println(filter_and_sorted_2)

    println(s"-----"*20)
    collection.filter(odd).map(println)
    
    println(s"-----"*20)
    collection.filter(odd).sorted.map(println)

}

// % scala Book.scala
// Compiling project (Scala 3.6.2, JVM (23))
// Compiled project (Scala 3.6.2, JVM (23))
// ----------------------------------------------------------------------------------------------------
// 1
// 4
// 6
// 8
// 6
// 0
// 8
// 76
// 90
// 56
// 9
// 3
// ----------------------------------------------------------------------------------------------------
// 1
// 4
// 6
// 8
// 6
// 0
// 8
// 9
// 3
// ----------------------------------------------------------------------------------------------------
// List(0, 1, 3, 4, 6, 6, 8, 8, 9)
// List(0, 1, 3, 4, 6, 6, 8, 8, 9)
// ----------------------------------------------------------------------------------------------------
// 1
// 9
// 3
// ----------------------------------------------------------------------------------------------------
// 1
// 3
// 9