// First comment out Book.scala before you can run below....

class Book(private val id_ : Int, private val title_ : String,private val author_ : String){
    def this(title: String, author: String) = this(Var.acc,title,author)
    def id = this.id_
    def title = this.title_
    def author = this.author_
    def describe : Unit = println(s"${this.id};${this.title};${this.author}")
    def sameAuthor(aBook : Book) = this.title == aBook.title
    def ==(aBook : Book) = (this.id==aBook.id)&& (this.title==aBook.title) && (this.sameAuthor(aBook))
}

object Var{
    private var ID : Int = 0
    def acc = {ID+=1;ID}    
}

class Biopic(private val famous_ : String, private val title_ : String, private val author_ : String) extends Book(title_, author_){

}

class Thriller(private val real_ : Boolean, private val title_ : String, private val author_ : String) extends Book(title_,author_){

}


object Test extends App {
    val aBiopic = new Biopic("Romain Gary","La Promesse de l'Aube","Romain Gary")    
    val aThriller = new Thriller(false,"The Silence of the Lambs","Thomas Harris")
    def fun(aBook: Book) = aBook match{
            case b: Biopic => println("This is a biopic")
            // case b: Biopic => println(s"This is a biopic of ${b.author}")
            case t: Thriller => println("This is a thriller")
            // case t: Thriller => println(s"This is a thriller of ${t.author}")
        }
    fun(aBiopic)
}


object Factorial extends App {
    //  recursive:
    def factorial(args: Int) : Int = if (args == 1) 1 else args * factorial(args - 1)

    //  pattern matching: The first case corresponds to our stop condition and the second case corresponds to recursive calls.
    def facto(args: Int): Int =  args match {
        case 1 => 1
        case args => args * facto(args - 1)
    }
}


object Fibonacci extends App {

    //  recursive:
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

    //  pattern matching: 
    def fibo(index: Int) : Int = index match {
        case 0 => 0
        case 1 => 1
        case index => fibo(index-1)+fibo(index-2)
    }

    // println(s"Final result: ${fibonacci(6)}")
    println(s"Final result: ${fibo(6)}")
}


// % scala Func.scala --main-class Fibonacci
// Compiling project (Scala 3.6.2, JVM (23))
// Compiled project (Scala 3.6.2, JVM (23))
// Final result: 8