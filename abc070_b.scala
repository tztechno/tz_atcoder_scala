abc070_b.scala
##############################
##############################
##############################
##############################
##############################
import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val a, b, c, d = sc.nextInt()

  println(
    (b.min(d) - a.max(c)).max(0)
  )
}
##############################
object Answer {val from = new java.util.Scanner(System.in)
def is(x:Any) = Console.println(x)}; import Answer.from._,Math._
object Main extends App {
  val a,b,c,d = nextInt
  Answer is max(min(b,d)-max(a,c),0)
}
##############################
object Main {
  def main(args: Array[String]): Unit = {
    import scala.io.StdIn.readLine
    val Array(datA, datB, datC, datD) = readLine.split(" ").map(_.toInt)
    val onTime = math.max(datA, datC)
    val offTime = math.min(datB, datD)
    val ans = if (offTime < onTime) 0
    else offTime - onTime
    println(ans)
  }
}
##############################

import scala.io.Source
import math.{max, min}

object Main extends App {
  val filePath = if (System.getProperty("os.name").toLowerCase.contains("linux")) "/dev/stdin" else "./input.txt"
  val input = Source.fromFile(filePath).getLines().next().split(" ")
  val a = input(0).toInt
  val b = input(1).toInt
  val c = input(2).toInt
  val d = input(3).toInt
  val t = max(min(b, d) - max(a, c), 0)
  println(t)
}
##############################
