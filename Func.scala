object Test extends App {
    var x = 8
    
    def double(args: Int) : Int = args * 2
    def triple(args: Int) : Int = args * 3

    val collection = List(1,2,3,4,5)
    val aList = List(4,5,2,3)

    val aListDoubled = aList.map(double)
    val aList6 = aListDoubled.map(triple)


    println(s"-----"*20)
    collection.map(println)


    println(s"-----"*20)
    println(collection(0))


    println(s"-----"*20)
    //higher order function a
    val result_a = collection.map(double)
    result_a.map(println)


    println(s"-----"*20)
    //higher order function b
    val result_b = collection.map(double)
    println(result_b(0))

    println(s"-----"*20)
    println(s"-----"*20)
    aList.map(println)
    
    println(s"-----"*20)
    aListDoubled.map(println)
    
    // Print out aList6, or you can also chain the map functions
    println(s"-----"*20)
    aList6.map(println)

    println(s"-----"*20)
    aList.map(double).map(triple).map(println)

}

// % scala Book.scala
// Compiling project (Scala 3.6.2, JVM (23))
// Compiled project (Scala 3.6.2, JVM (23))
// ----------------------------------------------------------------------------------------------------
// 1
// 2
// 3
// 4
// 5
// ----------------------------------------------------------------------------------------------------
// 1
// ----------------------------------------------------------------------------------------------------
// 2
// 4
// 6
// 8
// 10
// ----------------------------------------------------------------------------------------------------
// 2
// ----------------------------------------------------------------------------------------------------
// ----------------------------------------------------------------------------------------------------
// 4
// 5
// 2
// 3
// ----------------------------------------------------------------------------------------------------
// 8
// 10
// 4
// 6
// ----------------------------------------------------------------------------------------------------
// 24
// 30
// 12
// 18
// ----------------------------------------------------------------------------------------------------
// 24
// 30
// 12
// 18