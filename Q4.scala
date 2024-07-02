import scala.io.StdIn.readLine

object sumOfEven{
    def main(args: Array[String]): Unit = {
    println("Enter a list of integers (separated by spaces):")
    val input = readLine()
    val numbers = input.split("\\s+").map(_.toInt).toList
    val sumOfEvens = sumEvenNumbers(numbers)

    println(s"The sum of even numbers in this list: $sumOfEvens")
  }

    def sumEvenNumbers(numbers: List[Int]):Int ={
        if(numbers.isEmpty){
            0
        }else{
            val head = numbers.head
            val tail = sumEvenNumbers(numbers.tail)

            if(head % 2 == 0){
                head+tail
            }else{
                tail
            }
        }
    }
}