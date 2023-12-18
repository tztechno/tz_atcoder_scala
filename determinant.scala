object Main extends App {
  val input1 = scala.io.StdIn.readLine()
  val Array(a, b) = input1.split(" ").map(_.toInt)

  val input2 = scala.io.StdIn.readLine()
  val Array(c, d) = input2.split(" ").map(_.toInt)

  val ans = a * d - b * c

  println(ans)
}
