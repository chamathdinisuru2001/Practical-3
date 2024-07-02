import scala.io.StdIn.readLine

object ReverseApp{
    def main(args: Array[String]):Unit={
        println("Enter the string you want to reverse:")
        val original = readLine()
    
        val reverse = reverseString(original)

        println(s"Original string: $original")
        println(s"Reversed string: $reverse")
    }

    def reverseString(s: String): String={
        if(s.isEmpty) ""
        else reverseString(s.tail)+s.head
    }
}