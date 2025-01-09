object Test extends App {
    var x = 8

    def double(x: Int): Int = x * 2

    println(double(x))
    println(x)
    println(double(2))

}

// % scala Book.scala
// Compiling project (Scala 3.6.2, JVM (23))
// Compiled project (Scala 3.6.2, JVM (23))
// 16
// 8
// 4