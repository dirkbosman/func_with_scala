class Book(val id: Int,val title : String,val author : String){
    def describe : Unit = println(s"${this.id};${this.title};${this.author}")
    def ==(aBook : Book) = (this.id==aBook.id) && (this.title==aBook.title) && (this.author==aBook.author)
    def apply(isFrench : Boolean) = if (isFrench) println("This books exists in French") else println("There is not a French version of this book")
}
object Test extends App{
    val aBook = new Book(42,"La Promesse de l'Aube","Romain Gary")
    aBook.apply(true)
    aBook.apply(false)

    // We can also call it in the following way, which makes our object behave like a function:
    // aBook(true)
    // aBook(false)
}


// % scala Book.scala             
// Compiling project (Scala 3.6.2, JVM (23))
// Compiled project (Scala 3.6.2, JVM (23))
// This books exists in French
// There is not a French version of this book