/**
  * Created by leehwangchun on 2016. 6. 7..
  */
object QuestNo3 {
    var dictionary = Map[String, String]()

    def isContinue(input : String) : Boolean = input != "exit"

    def printMeans(value : String) : Unit = println(s"$value 의 의미는 ${dictionary(value)} 입니다")

    def inputMeans(value : String) = {
        print("의미를 입력하세요")
        val meanValue = scala.io.StdIn.readLine()
        this.dictionary += (value -> meanValue)
        println("입력완료")
    }

    def main(args : Array[String]) : Unit = {
        var inputValue = ""
        do{
            print("입력하세요 : ")
            inputValue = scala.io.StdIn.readLine()
            println(s"입력값은 $inputValue")

            if(dictionary contains inputValue ) {
                printMeans(inputValue)
            }
            else {
                inputMeans(inputValue)
            }
        }while( this.isContinue(inputValue) )
    }
}
