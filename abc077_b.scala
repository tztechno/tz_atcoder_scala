abc077_b.scala
##############################################
##############################################
##############################################
object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt()
  var i = 1
  while (i * i <= n) {
    i += 1
  }
  println((i-1) * (i-1))
}
##############################################
object Main{
  def main(args: Array[String]): Unit = {
    val n = io.StdIn.readDouble
    val ans = {
      val sq = math.sqrt(n).toInt
      sq * sq
    }
    println(ans)
  }
}
##############################################
object Answer {val from = new java.util.Scanner(System.in)
def is(x:Any) = Console.println(x)}; import Answer.from._
object Main extends App {
  val n = nextInt
  var a = Math.sqrt(n).toInt
  def rec (a:Int):Int ={
    if(a*a<=n) a*a
    else rec(a-1)
  }
  Answer is rec(a)
}
##############################################
object Main extends App {
  val n = scala.io.StdIn.readInt()
  val m = math.floor(math.sqrt(n))
  println(math.pow(m, 2).toInt)
}
##############################################
[python]
import math
n=int(input())
m=int(math.sqrt(n))
print(m**2)
##############################################
