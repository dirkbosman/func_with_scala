package exercise_4

abstract class Product(
    private val name_ : String,
    private val type_ : String // "Fruit" or "Juice"
  ) {

    def name = this.name_

    override def toString = s"${this.type_}: ${this.name_}"
}
