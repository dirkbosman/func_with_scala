package exercise_4

class Fruit(private val name_ : String)
  extends Product(name_, "Fruit") {

  def ==(fruit: Fruit): Boolean = this.name_ == fruit.name_

  def !=(fruit: Fruit): Boolean = !this.==(fruit)

  override def equals(obj: Any): Boolean = obj match {
    case fruit: Fruit => this.name_ == fruit.name_
    case _ => false
  }

  override def hashCode: Int = name_.hashCode
}