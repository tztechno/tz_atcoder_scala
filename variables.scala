//abc170_a variables.scala
#####################################
object Main {
  def main(args: Array[String]): Unit = {
    val nums = scala.io.StdIn.readLine.split( " " ).map{ _.toInt }
    var count = 0
    nums.foreach{ i =>
      count += 1
      if ( i == 0 ) println( count )
    }
  }
}
#####################################
import scala.io.StdIn._
object Main extends App {
  val sc = new java.util.Scanner(System.in)
  println {
    readLine.split(" ").map(_.toInt).indexOf(0) + 1
  }
}
#####################################
object Answer {val from = new java.util.Scanner(System.in)
def is(x:Any) = Console.println(x)}; import Answer.from._
object Main extends App {
    val xs = List.fill(5)(nextInt)
    Answer is 15-xs.sum
}
#####################################
object Main extends App {
  val input1 = scala.io.StdIn.readLine()
  val X = input1.split(" ").map(_.toInt)
  for (i <- 0 until 5) {
    if (X(i) == 0) {
      println(i + 1)
    }
  }
}
#####################################
