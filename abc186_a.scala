abc186_a.scala
############################################
############################################
############################################
############################################
############################################
############################################
############################################
object Answer {val from = new java.util.Scanner(System.in)
def is(x:Any) = Console.println(x)}; import Answer.from._
object Main extends App {
    val n,w = nextInt
    Answer is n/w
}

############################################
import scala.io.StdIn
object Main {
    def main(args: Array[String]): Unit = {
        val inputStr = StdIn.readLine()
        val Array(n, w) = inputStr.split(" ").map(_.toInt)
        val result = n / w
        println(result)
    }
}
############################################
object Main {
  def main(args: Array[String]): Unit = {
    val Array(n,w) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    val ans = n/w
    println(ans)
  }
}
############################################
[python]
n,w=map(int,input().split())
print(n//w)
############################################
