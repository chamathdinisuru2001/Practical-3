import scala.io.StdIn.readLine

object Filter{
    def main(args: Array[String]):Unit ={
    println("Enter the strings separated with commas:")
    val input = readLine();

    val strings = input.split(",").map(_.trim).toList

    val filteredList = filterStrings(strings,5)

    println(s"Strings grater than 5 characters: $filteredList")
    }

    def filterStrings(strings: List[String],length: Int): List[String]={
        if(strings.isEmpty){
            List.empty
        }else{
            val head= strings.head
            val tail=filterStrings(strings.tail,length)
            if(head.length > length){
                head :: tail
            }else{
                tail
            }
        }
    }
}