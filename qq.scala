object Main extends App {
  print("Enter a string: ")
  val input = scala.io.StdIn.readLine()

  val a = input(0).toString.toInt
  val b = input(2).toString.toInt

  val ans = a * b
  println(ans)
}
