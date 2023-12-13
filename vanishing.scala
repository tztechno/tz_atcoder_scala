import scala.io.Source

object Main extends App {
  val filePath = if (System.getProperty("os.name").toLowerCase.contains("linux")) "/dev/stdin" else "./input.txt"
  val input = Source.fromFile(filePath).getLines().next()

  val Array(V, T, S, D) = input.split(" ").map(_.toInt)

  if (V * T <= D && D <= V * S) {
    println("No")
  } else {
    println("Yes")
  }
}
