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

    def isEven(value : Int) : Boolean = {
        if(value % 2 == 1)
            false
        else
            true
    }

    def main(args : Array[String]) : Unit = {
        var sum = 0
        sum = 0
        for ( i <- 0 to 100)
            sum += i
        println(sum)

        sum = 0
        for ( i <- 0 to 100 if this.isOdd(i) )
            sum += i
        println(sum)

        sum = 0
        for( i <- 0 to 100 if this.isEven(i) )
            sum += i
        println(sum)
    }
}
