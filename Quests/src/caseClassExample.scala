/**
  * Created by leehwangchun on 2016. 7. 4..
  */
abstract class Packet

case class CreateName(name : String) extends Packet
case class CharacterMove(x : Int, y : Int) extends Packet
case class Chatting(message : String) extends Packet

object caseClassExample {
    def PacketProcess(packet : Packet) : Unit = {
        packet match {
            case CreateName(name) =>
                println("CreateName Received : " + name)
            case CharacterMove(x, y) =>
                println("Move Received" + x + " " + y)
            case Chatting(message) =>
                println("Chatting Received " + message)

        }
    }

    def main(args : Array[String]): Unit = {
        PacketProcess(CreateName("elluard"))
        PacketProcess(CharacterMove(1,2))
        PacketProcess(Chatting("Hi everyOne"))
    }

}
