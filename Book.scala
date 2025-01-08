// As you can see, we can call the describe method of the Book class on an instance of the Biopic class. 
// This is possible, thanks to inheritance. In the same way, the second constructor is used to build an 
// object of the class Biopic. Indeed, when constructing an instance of the Biopic class, we don't have 
// to fill in the id_attribute. In the same way, the classes that we made inherit from App avoided writing 
// the main method. This initial main function took as argument an array of strings named args. This 
// corresponds to the arguments we could have given with the scala command.

class Book(private val id_ : Int, private val title_ : String, private val author_ : String) {
    def this(title: String, author: String) = this(Var.acc, title, author)

    def id = this.id_
    def title = this.title_
    def author = this.author_

    def describe: Unit = println(s"${this.id};${this.title};${this.author}")
    def sameAuthor(aBook: Book): Boolean = this.author == aBook.author
    def ==(aBook: Book): Boolean = (this.id == aBook.id) && (this.title == aBook.title) && (this.sameAuthor(aBook))
}

object Var {
    private var ID: Int = 0
    def acc = { ID += 1; ID }
}

class Biopic(private val famous_ : String, private val title_ : String, private val author_ : String)
    extends Book(title_, author_)

object Test extends App {
    val aBook = new Book("Les Misérables", "Victor Hugo")
    val bBook = new Book("L'Assommoir", "Emile Zola")
    val aBiopic = new Biopic("Romain Gary", "La Promesse de l'Aube", "Romain Gary")
    
    // The describe method is called for each book and the biopic. This prints the details (id, title, and author) of each
    aBook.describe
    bBook.describe
    aBiopic.describe

    // The sameAuthor method checks if the aBiopic and aBook have the same author. Since their authors 
    // are different ("Romain Gary" vs. "Victor Hugo"), it prints: This is not the same author
    if (aBiopic.sameAuthor(aBook)) println("This is the same author!")
    else println("This is not the same author")

    // The program checks for command-line arguments. Since none were provided, it prints: No arguments provided
    if (Test.args != null && Test.args.nonEmpty)
        println(Test.args.mkString(" "))
    else
        println("No arguments provided")
}


// % scala Book.scala
// Compiling project (Scala 3.6.2, JVM (23))
// Compiled project (Scala 3.6.2, JVM (23))
// 1;Les Misérables;Victor Hugo
// 2;L'Assommoir;Emile Zola
// 3;La Promesse de l'Aube;Romain Gary
// This is not the same author
// No arguments provided