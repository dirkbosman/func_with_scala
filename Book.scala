class Book(val id: Int = 0, val pages: Int = 0, val title : String = "Unknown",val author : String = "Unknown"){
    def describe : Unit = println(s"${this.id};${this.title};${this.author}")
    def tooLong = this.pages > 250
}

object Test extends App{
    val aBook = new Book(42,460,"La Promesse de l'Aube","Romain Gary")
    aBook.describe

    if (aBook.tooLong) println(s"The book ${aBook.title} is long.")	
}

// Result.....
// dbosman@dbosmans-MBP func_with_scala % scala Book.scala             
// Compiling project (Scala 3.6.2, JVM (23))
// Compiled project (Scala 3.6.2, JVM (23))
// 42;La Promesse de l'Aube;Romain Gary
// The book La Promesse de l'Aube is long.