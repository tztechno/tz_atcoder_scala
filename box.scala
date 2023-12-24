#ABC180_A
#box

import scala.io.Source

object Main extends App {
  val filePath = if (System.getProperty("os.name").toLowerCase.contains("linux")) "/dev/stdin" else "./input.txt"
  val input = Source.fromFile(filePath).getLines().next()
  val N = input.split(" ")(0).toInt
  val A = input.split(" ")(1).toInt
  val B = input.split(" ")(2).toInt
  println(N-A+B)
}
