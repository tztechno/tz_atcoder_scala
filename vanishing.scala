import scala.io.Source

object Main extends App {
  val filePath = if (System.getProperty("os.name").toLowerCase.contains("linux")) "/dev/stdin" else "./input.txt"
  val input = Source.fromFile(filePath).getLines().next()

  val V = input.split(" ")(0).toInt
  val T = input.split(" ")(1).toInt
  val S = input.split(" ")(2).toInt
  val D = input.split(" ")(3).toInt

  if (V * T <= D && D <= V * S) {
    println("No")
  } else {
    println("Yes")
  }
}
