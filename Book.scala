class Book(val id: Int, val title: String, val author: String){
    def describe : Unit = println(s"${this.id}; ${this.title}; ${this.author}")
    def equal(aBook : Book) = (this.id==aBook.id) && (this.title==aBook.title) && (this.author==aBook.author)
}

object Test extends App{
    val aBook = new Book(42,"La Promesse de l'Aube","Romain Gary")
    val bBook = new Book(63,"Le Père Goriot","Balzac")
    aBook.describe
    bBook.describe
    println(aBook == bBook) // or println(aBook.equal(bBook))
}

// func_with_scala % scala Book.scala             
// 42; La Promesse de l'Aube; Romain Gary
// 63; Le Père Goriot; Balzac
// false
// false