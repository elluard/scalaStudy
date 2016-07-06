/**
  * Created by leehwangchun on 2016. 7. 6..
  */
class Animal2 {
    val Name = "Animal"
    def Move() : Unit ={ println(Name + " Animal Move!") }
}

trait Tiger extends Animal2 {
    override val Name = "Tiger"
    override def Move() : Unit = {
        super.Move()
        println(Name + " Tiger Move")
    }
}

trait Lion extends Animal2 {
    override val Name = "Lion"
    override def Move() : Unit = {
        super.Move()
        println(Name + " Lion Move")
    }
}

class Liger extends Tiger with Lion {
    override val Name = "Liger"
    override def Move() : Unit = {
        super.Move()
        println(Name + " Liger Move")
    }
}

object traitExample {
    def main(args : Array[String]): Unit = {
        val animalObj = new Liger
        animalObj.Move()
    }
}
