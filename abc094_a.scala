//abc094_a.scala
####################################
####################################
####################################
####################################
####################################
####################################
object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a,b,x = sc.nextInt()

  println(if ((a to a+b).contains(x)) "YES" else "NO")
}
####################################
import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val a, b, x = sc.nextInt()
  if(a <= x && a+b >= x) println("YES") else println("NO")
}
####################################
object Answer {val from = new java.util.Scanner(System.in)
def is(x:Any) = Console.println(x)}; import Answer.from._
object Main extends App {
    val a,b,x = nextInt
    Answer is (if(a<=x&x<=a+b) "YES" else "NO")
}

####################################
object Main {
  def main(args: Array[String]): Unit = {
    val Array(a, b, x) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    val ans = if (a <= x && x <= a + b) "YES" else "NO"
    println(ans)
  }
}
####################################
