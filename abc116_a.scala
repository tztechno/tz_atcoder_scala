abc116_a.scala
###########################################
###########################################
###########################################
###########################################
###########################################
###########################################
###########################################
[Native AC]
import scala.io.StdIn
object Main {
  def main(args: Array[String]): Unit = {
    val s = StdIn.readLine().split(" ").map(_.toInt)
    val ans = s(0) * s(1) / 2
    println(ans)
  }
}
###########################################
[Dotty AC][Native CE]
import java.util.Scanner
object Main extends App {
  val sc = new Scanner(System.in)
  val a,b,c = sc.nextInt()
  println(a*b/2)
}
###########################################
[python]
a,b,c=map(int,input().split())
print(a*b//2)
###########################################
