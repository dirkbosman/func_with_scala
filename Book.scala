// We see that the ID variable is indeed incremented at each instantiation of a Book object. 
// The variable ID of Var is available in Test but also in Book by the method acc.

class Book(val id: Int,val title: String, val author: String){
    def this(title: String, author: String) = this(Var.acc,title,author)
    def this(title: String) = this(Var.acc,title,"Unknown")
    def describe : Unit = println(s"${this.id};${this.title};${this.author}")
}
object Var{
    private var ID : Int = 0
    def acc = {ID+=1;ID}    
}

object Test extends App {
    val aBook = new Book("Voyage au bout de la nuit","Céline")
    aBook.describe
    val bBook = new Book("Jane Eyre","Charlotte Brontë")
    bBook.describe
}


// % scala Book.scala
// Compiling project (Scala 3.6.2, JVM (23))
// Compiled project (Scala 3.6.2, JVM (23))
// 1;Voyage au bout de la nuit;Céline
// 2;Jane Eyre;Charlotte Brontë