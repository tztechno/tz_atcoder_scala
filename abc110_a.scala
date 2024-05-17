abc110_a.scala
###########################################
###########################################
###########################################
object Answer {val from = new java.util.Scanner(System.in)
def is(x:Any) = Console.println(x)}; import Answer.from._
object Main extends App {
    val abc = List.fill(3)(nextInt)
    Answer is abc.max*9+abc.sum
}
###########################################
import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = List.fill(3)(sc.nextInt()).sorted
  println(n.max*10+n(1) + n(0))
}
###########################################
object Main {
  def main(args: Array[String]): Unit = {
    val Array(a,b,c) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    val ans=(a+b+c)+math.max(a,math.max(b,c))*9
    println(ans)
  }
}
###########################################
[python]
a,b,c=map(int,input().split())
ans=(a+b+c)+max(a,b,c)*9
print(ans)
###########################################
