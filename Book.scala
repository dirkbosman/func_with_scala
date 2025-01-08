// Do not forget to replace val by var. Otherwise you will have an error.
class Book(private var id: Int, val pages: Int, val title: String, val author: String ){
    def describe : Unit = println(s"${this.id};${this.title};${this.author}")
    def getId = this.id
    def setId(new_id: Int): Unit = this.id = new_id
}

// class Book(private var id_ : Int, val pages: Int, val title: String, val author: String ){
//     def describe : Unit = println(s"${this.id};${this.title};${this.author}")
//     def id = this.id_
//     def id_= (new_id : Int) : Unit = this.id_ = new_id
// }


object Test extends App{
    val aBook = new Book(42,464,"La Promesse de l'Aube","Romain Gary")
    aBook.describe
    println(aBook.getId)
    aBook.setId(1954)
    println(aBook.getId)
}

// object Test extends App{
//     val aBook = new Book(42,464,"La Promesse de l'Aube","Romain Gary")
//     aBook.describe
//     println(aBook.id)
//     aBook.id = 1954
//     println(aBook.id)
// }


// % scala Book.scala             
// Compiling project (Scala 3.6.2, JVM (23))
// Compiled project (Scala 3.6.2, JVM (23))
// 42;La Promesse de l'Aube;Romain Gary
// 42
// 1954
