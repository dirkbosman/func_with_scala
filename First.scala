object First extends App {
    val a: Int = 4
    println(s"a: $a");

    var b: Int = 3
    println(s"b: $b");
    b = 5
    println(s"b (new): $b");

    // val c: Short = 45678 // Would through an error, because it is out of range.
    val c: Short = 32767
    println(s"c: $c");

    val d : Long = 76537292
    println(s"d: $d");

    val e: Long = 765372920763833L
    println(s"e: $e");

    val f: Double = 3.14
    println(s"f: $f")

    val g: Float = 3.15f
    println(s"g: $g")

    val letter: Char = 'a'
    println(s"letter: $letter")

    val percent: Char = '%'
    println(s"percent: $percent")

    val sentence: String = "Scala is fun!"
    println(s"sentence: $sentence")

    val name: String = "Frédéric Bastiat"
    println(s"Hello, my name is $name")
    println(s"1 + 1 = ${1+1}")

    val word: String = "I hate Scala"
    println(word(0))
    // println(word(1))
    println(word(2))
    println(word(3))
    println(word(4))
    println(word(5))
    println(word.length)
    println(word.slice(0,6))
    println(word.slice(word.length - 5, word.length))
    println(word.slice(word.length - "Scala".length, word.length))

    val x: String = "Scala"
    val y: String = "scala"
    println(x==y)

    val isGood: Boolean = true
    val isUgly: Boolean = false
    println(isGood==isUgly)


    println(s"-----------------")

    val h = 10;
    val i = 20;

    println(s"For h=10, i=20 ....")
    println(s"h + i = ${h + i}")
    println(s"h - i = ${h - i}")
    println(s"h * i = ${h * i}")
    println(s"i / h = ${i / h}")
    println(s"i % h = ${i % h}")    

    val word1 : String = "I"
    val word2 : String = "like"
    val word3 : String = "Scala"
    println(word1+ " " +word2+ " " +word3)

    println(s"-----------------")

    val j = 10;
    val k = 20;

    println(s"For j=10, k=20 ....")
    println(s"j == k = ${j == k}")
    println(s"j != k = ${j != k}")
    println(s"j > k = ${j > k}")
    println(s"j < k = ${j < k}")
    println(s"j <= k = ${j <= k}")
    println(s"j >= k = ${k <= j}")


    val wordz: String = "fun"
    val soda = "Ice Tea"

    println(false == true)
    println("LOL" != "fun")
    println(wordz  == "fun")
    // println("fun" != 'a')
    // println("fun" != 'a'.toString)

    println(wordz>soda)
    println('a'==97)


    println(s"-----------------")

    val l = 6
    val m = 7

    val A = l > m
    val B = l < m

    println(A)
    println(B)

    println(s"A && B = ${A && B}")
    println(s"A || B = ${A || B}")
    println(s"!(A && B) = ${!(A && B)}")

    // Expressive language to give "unconventional" names to functions:
    def ? = println("I don't know")
    ?

    println(s"-----------------")


    // val age = 19
    // if (age > 21){
    //     println("I can buy beer in America and everywhere")
    // }
    // else if (age > 18){
    //     println("I can't buy beer in America but in France, I can")
    // }
    // else{
    //     println("I can't buy beer")
    // }

    val age = 19
    if (age > 21)
        println("I can buy beer in America")
    else if (age > 18)
        println("I can't buy beer in America but in France, I can")
    else
        println("I can't buy beer")


    println(s"-----------------")

    def healthy(bpm : Float) = (bpm < 100) && (bpm > 60)
    val state = if (healthy(82)) "I am healthy" else "I am in danger"
    println(state)

    println(s"-----------------")
    
    val aList = List(1,2,3,4)

    println(aList(0))
    println(aList(3))
    println(aList.slice(0,2))
    println(aList.length)
    
    println(s"-----------------")

    val bList = List(8,2,98,19,16,20,10) 
    println(bList.reverse)
    println(bList.sorted)
    
    // returns the list aList with 4 at the end
    println(bList :+ 4)

    // returns the list aList with 36 at the start
    println(36 +: bList)

    // The new values are not saved....
    println(bList)

    // If you want to save the new list with 4 at the end:
    val newList = bList :+ 4
    val newnewList = 36 +: newList
    println(newnewList)
    println(newnewList.sorted)

    // If we want to concatenate two lists we use the function:::
    aList:::aList.reverse


    println(s"-----------------")

    // because of its immutable character, we can't change the value of the list elements. 
    // bList(0)=1

    val anArray = Array("A","B","C")
    println(anArray(0))
    anArray.update(0,"1")
    println(anArray(0))


    println(s"-----------------")

    // Note on Functional programming: Traditional while/for one are not efficient on Scala and are therefore not recommended. This is considered bad practice.

    val zList = List(1,2,3,4,5)
    val zListPlusOne = for(element <- zList) yield element + 1
    println(zListPlusOne)

}




// % scala First.scala                
// Compiling project (Scala 3.6.2, JVM (23))
// Compiled project (Scala 3.6.2, JVM (23))
// a: 4
// b: 3
// b (new): 5
// c: 32767
// d: 76537292
// e: 765372920763833
// f: 3.14
// g: 3.15
// letter: a
// percent: %
// sentence: Scala is fun!
// Hello, my name is Frédéric Bastiat
// 1 + 1 = 2
// I
// h
// a
// t
// e
// 12
// I hate
// Scala
// Scala
// false
// false
// -----------------
// For h=10, i=20 ....
// h + i = 30
// h - i = -10
// h * i = 200
// i / h = 2
// i % h = 0
// I like Scala
// -----------------
// For j=10, k=20 ....
// j == k = false
// j != k = true
// j > k = false
// j < k = true
// j <= k = true
// j >= k = false
// false
// true
// true
// true
// true
// -----------------
// false
// true
// A && B = false
// A || B = true
// !(A && B) = true
// I don't know
// -----------------
// I can't buy beer in America but in France, I can
// -----------------
// I am healthy
// -----------------
// 1
// 4
// List(1, 2)
// 4
// -----------------
// List(10, 20, 16, 19, 98, 2, 8)
// List(2, 8, 10, 16, 19, 20, 98)
// List(8, 2, 98, 19, 16, 20, 10, 4)
// List(36, 8, 2, 98, 19, 16, 20, 10)
// List(8, 2, 98, 19, 16, 20, 10)
// List(36, 8, 2, 98, 19, 16, 20, 10, 4)
// List(2, 4, 8, 10, 16, 19, 20, 36, 98)
// -----------------
// A
// 1
// -----------------
// List(2, 3, 4, 5, 6)

