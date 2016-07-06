/**
  * Created by leehwangchun on 2016. 7. 6..
  */
class Animal2 {
    def Move() : Unit ={ println("Animal Move!") }
}

trait Tiger extends Animal2 {
    override def Move() : Unit = {
        super.Move()
        println("Tiger Move")
    }
}

trait Lion extends Animal2 {
    override def Move() : Unit = {
        super.Move()
        println("Lion Move")
    }
}

class Liger extends Animal2 with Tiger with Lion {
    override def Move() : Unit = {
        super.Move()
        println("Liger Move")
    }
}

object traitExample {
    def main(args : Array[String]): Unit = {
        val animalObj = new Liger
        animalObj.Move()
    }
}
