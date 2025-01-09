import scala.util.Random

object Test extends App {
    def someQuote: String = {
        val aList = List(666, 777, 4, 8, 15, 16, 23, 42, 1, 13, 36)
        val selectedNumber = aList(Random.nextInt(aList.length))
        val quote = selectedNumber match {
            case 666 => "I am in hell"
            case 777 => "I am lucky"
            case 1 => "This is the life"
            case 13 => "I am unlucky"
            case 4 | 8 | 15 | 16 | 23 | 42 => "I am lost"
            case _ => "I am 36"
        }
        println(s"Selected number: $selectedNumber")
        quote
    }

    println(someQuote)
    println(someQuote)
}

// % scala Func.scala --main-class Factorial
// Compiling project (Scala 3.6.2, JVM (23))
// Compiled project (Scala 3.6.2, JVM (23))
// Selected number: 1
// This is the life
// Selected number: 4
// I am lost