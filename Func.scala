object Test extends App {

    println(s"-----"*20)

    //  We instantiate an object Function1 which indicates that our function takes only one argument. 
    //  Then, in the brackets, we specify the input type first and the output type last. We find here 
    // the apply method which is central to the handling of these functions. Without this method, we 
    // will not have the *"functional" behaviour of our objects.

    val plusOne = new Function1[Int,Int]{
        override def apply(x:Int) = x + 1 
    }    

    val square = new Function1[Int,Int]{
        override def apply(x:Int) = x * x 
    }

    val concat = new Function2[String,String,String]{
        override def apply(x:String,y:String) = x + y 
    }

    val intToString = new Function1[Int, String] {
        override def apply(x: Int) = x.toString
    }


    val comp1 = plusOne.compose(square) // This will call plusOne at the end
    val comp2 = plusOne.andThen(square) // This will call plusOne at the beginning
    val comp3 = intToString.andThen(concat.curried("Hello ")) // This will call intToString at the beginning

    println(comp1(3)) // (3^2)+1
    println(comp2(3)) // (1+3)^2
    println(comp3(3)) // "Hello " + "3"


}

// % scala Book.scala
// Compiling project (Scala 3.6.2, JVM (23))
// Compiled project (Scala 3.6.2, JVM (23))
// ----------------------------------------------------------------------------------------------------
// 10
// 16
// Hello 3
