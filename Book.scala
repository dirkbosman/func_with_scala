// In Java, we are used to use the null keyword to represent a missing value. 
// Even if it also exists in Scala, it is better to use Option where you put 
// None when you don't have the information, otherwise it will be Some(a_value). 

class Book(val id: Int = 0, val pages: Int = 0, val title : String = "Unknown",val author : String = "Unknown"){
}

object Test extends App{
    val aBook : Book = new Book
    val bBook : Book = new Book(title="Les Misérables")
    val cBook : Book = new Book(author="Hajime Isayama")
    println(s"${aBook.id};${aBook.title};${aBook.author}")
    println(s"${bBook.id};${bBook.title};${bBook.author}")
    println(s"${cBook.id};${cBook.title};${cBook.author}")
}

// Result.....
// % scala Book.scala
// 0;Unknown;Unknown
// 0;Les Misérables;Unknown
// 0;Unknown;Hajime Isayama