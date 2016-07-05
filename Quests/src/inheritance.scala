/**
  * Created by leehwangchun on 2016. 7. 5..
  */

class Animal {
    val legCount : Int = 0
    def speak() : Unit = { println("Speak.")}
}

class Cat extends Animal {
    override val legCount = 4
    override def speak() : Unit = { println("Meow")}
}


class Dog extends Animal {
    override val legCount = 4
    override def speak() : Unit = { println("Bow Wow")}
}


object inheritance {
    def main(args : Array[String]) : Unit = {
        var moveObj = new Animal
        moveObj.speak()
        moveObj = new Cat
        moveObj.speak()
    }

}
