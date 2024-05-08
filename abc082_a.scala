abc082_a.scala
##########################################
##########################################
##########################################
object Main extends App {
  val sc = new java.util.Scanner(System.in)
  println(math.ceil(List.fill(2)(sc.nextDouble()).sum / 2).toInt)
}

##########################################
import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val a, b = sc.nextDouble()
  val ans = (a+b)/2
  println(Math.ceil(ans).toInt)
}
##########################################
import scala.io.StdIn
object Main {
    def main(args: Array[String]): Unit = {
        val inputStr = StdIn.readLine()
        val Array(a,b) = inputStr.split(" ").map(_.toInt)
        val result = (a+b+1)/2
        println(result)
    }
}
##########################################
[python]
import math
a,b=map(int,input().split())
print( (a+b+1)//2 )
##########################################
