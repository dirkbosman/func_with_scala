// We have seen previously that it is possible to use the set of functions of a parent class on an instance of a child class.

class Book(private val id_ : Int, private val title_ : String, private val author_ : String){
    def this(title: String, author: String) = this(Var.acc,title,author)
    def id = this.id_
    def title = this.title_
    def author = this.author_
    def describe : Unit = println(s"${this.id};${this.title};${this.author}")

    // Overload: 
    // We can also check that the author of a book is the same as the author of another book by giving a string as an
    // argument instead of a Book object. This is also what we saw with constructors. The si`gnature was different, but 
    // the compiler is able to determine which constructor should be used to create the objects.    
    // def sameAuthor(aBook : Book) = this.title == aBook.title
    // def sameAuthor(aBook : Book) = this.author == aBook.author
    def sameAuthor(author: String): Boolean = this.author == author

    def ==(aBook: Book): Boolean =
        (this.id == aBook.id) &&
        (this.title == aBook.title) &&
        (this.sameAuthor(aBook.author))

    override def toString = s"The id is ${this.id}\nThe title is ${this.title}\nThe author is ${this.author}" 

}


object Var{
    private var ID : Int = 0
    def acc = {ID+=1;ID}    
}

class Biopic(private val famous_ : String, private val title_ : String, private val author_ : String) extends Book(title_,author_){
    def famous= this.famous_
    
    // We can use the keyword super which will be like the keyword this but refers to the parent class.
    def ==(aBiopic : Biopic) = (super.== (aBiopic)) && (this.famous == aBiopic.famous) 
    def ~(aBiopic : Biopic) = (super.title == aBiopic.title)  && (super.author == this.author) && (this.famous == aBiopic.famous)
    override def toString = super.toString() + s"\nThis book speaks about ${this.famous}." 
}

object Test extends App {
    val aBiopic = new Biopic("Romain Gary ","La Promesse de l'Aube","Romain Gary")    
    val bBiopic = new Biopic("John Nash","A beautiful Mind","Sylvia Nasar")
    val cBiopic = new Biopic("John Nash","A beautiful Mind","Sylvia Nasar")    
    
    println(s"-----"*20)
    println(s"Describe aBiopic, bBiopic & cBiopic:")
    aBiopic.describe 
    bBiopic.describe
    aBiopic.describe

    println(s"-----"*20)
    val aBook = new Book("Les Misérables", "Victor Hugo")
    println(s"Print aBook:")
    println(aBook)

    println(s"-----"*20)
    println(s"Print aBiopic:")
    println(aBiopic)

    println(s"-----"*20)
    // The previous program displays the sentence "This is not the same book" for the instances bBiopic and cBiopic 
    // even though they are the same instances. The reason is that we also test the equality on the id.
    if (bBiopic == cBiopic) 
        println("This is the same book!") 
    else 
        println("This is *not* the same book!")    

    println(s"-----"*20)
    // Based on your current logic in ~, the program will print: "These biopics are similar!"
    // Because bBiopic and cBiopic have the same title, author, and famous values.
    if (bBiopic ~ cBiopic) 
        println("These biopics are similar!")
    else 
        println("These biopics are *not* similar!")
    println(s"-----"*20)
    
}

// % scala Book.scala
// Compiling project (Scala 3.6.2, JVM (23))
// Compiled project (Scala 3.6.2, JVM (23))
// ----------------------------------------------------------------------------------------------------
// Describe aBiopic, bBiopic & cBiopic:
// 1;La Promesse de l'Aube;Romain Gary
// 2;A beautiful Mind;Sylvia Nasar
// 1;La Promesse de l'Aube;Romain Gary
// ----------------------------------------------------------------------------------------------------
// Print aBook:
// The id is 4
// The title is Les Misérables
// The author is Victor Hugo
// ----------------------------------------------------------------------------------------------------
// Print aBiopic:
// The id is 1
// The title is La Promesse de l'Aube
// The author is Romain Gary
// This book speaks about Romain Gary .
// ----------------------------------------------------------------------------------------------------
// This is *not* the same book!
// ----------------------------------------------------------------------------------------------------
// These biopics are similar!
// ----------------------------------------------------------------------------------------------------