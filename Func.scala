object Test extends App {
    def anotherOne(x:Int) : Unit = {
        if(x==18) println("Stopped")
        else{ 
            println("Another One")
            anotherOne(x+1)
        }
    }
    anotherOne(0)
}

object Factorial extends App {
    def factorial(args: Int): Int = {
        if (args == 1) {
            println(s"Returning 1")
            1
        } else {
            val result = args * factorial(args - 1)
            println(s"Returning $result for args = $args")
            result
        }
    }

    println(s"-------"*20)
    println(factorial(3))
}


object Fibonacci extends App {
    def fibonacci(x: Int): Int = {
        if(x < 2) {
            println(s"Returning $x for x = $x") // This is the log base case
            println(s"======="*20)
            x
        }
        else {
            val result = fibonacci(x - 1) + fibonacci(x - 2)
            println(s"Returning $result for x = $x") // This is the log recursive step
            println(s"-------"*20)
            result
        }
    }
    println(s"Final result: ${fibonacci(6)}")
}




// % scala Func.scala --main-class Factorial
// Compiling project (Scala 3.6.2, JVM (23))
// Compiled project (Scala 3.6.2, JVM (23))
// --------------------------------------------------------------------------------------------------------------------------------------------
// Returning 1
// Returning 2 for args = 2
// Returning 6 for args = 3
// 6