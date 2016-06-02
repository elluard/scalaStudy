/**
  * Created by leehwangchun on 2016. 6. 2..
  */
object QuestNo2 {
    def isOdd(value : Int) : Boolean = {
        if(value%2 == 1)
            true
        else
            false
    }

    def main(args : Array[String]) : Unit = {
        var sum = 0
        for (
            i <- 1 until 101
            if this.isOdd(i)
        ) sum += i
        println(sum)
    }
}
