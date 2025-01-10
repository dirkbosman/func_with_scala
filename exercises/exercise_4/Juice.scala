package exercise_4

class Juice(private val name_ : String, private val volume_ : Short)
  extends Product(name_, "Juice") {

  def ==(juice: Juice): Boolean =
    this.name_ == juice.name_ && this.volume_ == juice.volume_

  def !=(juice: Juice): Boolean = !this.==(juice)

  override def equals(obj: Any): Boolean = obj match {
    case juice: Juice => this.name_ == juice.name_ && this.volume_ == juice.volume_
    case _ => false
  }

  override def hashCode: Int = (name_, volume_).hashCode
}