import scala.io.StdIn.readLine

object mean{
    def main(args: Array[String]):Unit ={
    println("Enter the first number: ")
    val num1 = readLine().toInt

    println("Enter the second number: ")
    val num2 = readLine().toInt

    val mean = calcMean(num1,num2)

    println(s"The arithmatic mean of $num1 & $num2 is: $mean")
    }

    def calcMean(num1:Int, num2:Int): Double ={
        val sum = num1+num2
        val mean=sum.toDouble/2.0
        
        roundup(mean)
    }
    def roundup(number: Double): Double ={
        math.round(number*100.0)/100.0
    }
}