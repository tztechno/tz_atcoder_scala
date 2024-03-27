abc096_a.scala
#########################################
#########################################
#########################################
#########################################
#########################################
#########################################
#########################################
import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val a, b = sc.nextInt()
  if(a<=b) println(a) else println(a-1)
}
#########################################
object Answer {val from = new java.util.Scanner(System.in)
def is(x:Any) = Console.println(x)}; import Answer.from._
object Main extends App {
    val a,b = nextInt
    Answer is (if(a>b) a-1 else a)
}
#########################################
object Main {
  def main(args: Array[String]): Unit = {
    val Array(a, b) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    val ans = if (a <= b) a else a-1
    println(ans)
  }
}
#########################################
