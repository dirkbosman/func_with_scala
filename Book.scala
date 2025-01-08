// The above program causes an error because we tried to access the id attribute value of the aBook instance 
// in the Test part. If you remove the last line, the program will work again. However, if we look closely, 
// we can see the value of id although it is a private field of the Book class. The reason for this is simply 
// that we are calling the method describe. This method remains accessible outside the Book class. As we access 
// the id attribute from the Book class, this does not cause an error. If we had put the private keyword to the 
// describe function, we would have obtained the same error as before.

class Book(private val id: Int, val pages: Int, val title: String, val author: String ){
    def describe : Unit = println(s"${this.id};${this.title};${this.author}")
}

object Test extends App{
    val aBook = new Book(42,464,"La Promesse de l'Aube","Romain Gary")
    aBook.describe
    println(aBook.id) // this will through an error due to being protected...s
}

// % scala Book.scala             
// [error] ./Book.scala:8:13
// [error] value id cannot be accessed as a member of (Test.aBook : Book) from object Test.
// [error]   private value id can only be accessed from class Book.
// [error]     println(aBook.id)
// [error]        
