//abc086_a.scala
################################
################################
################################
object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in) // ①
    val a, b = sc.nextInt() // ②
    val c = a * b
    val ans = if (c % 2 == 0) "Even" else "Odd" // ③
    println(ans)
  }
}
################################
object Answer {val from = new java.util.Scanner(System.in)
def is(x:Any) = Console.println(x)}; import Answer.from._
object Main extends App {
    val  a,b = nextInt
    Answer is (if(a*b%2==0)"Even" else "Odd")
}

################################
object Main extends App {
  import scala.io.StdIn._
  val num = readLine.split(" ").map(_.toInt).product
  val result = if (num % 2 == 0 ) "Even" else "Odd"
  println(result)
}
################################
import scala.io.StdIn._
object Main extends App {
  val Array(a,b) = readLine().split(" ").map(_.toInt)
  val c=(a*b)%2
  var ans=""
  if (c==0) {
    ans="Even"      
  }
  else {
    ans="Odd"      
  }
  println(ans)
}
################################
