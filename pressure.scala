object Main extends App {

  //print("Enter an integer: ")
  val input = scala.io.StdIn.readLine()

  try {
    val D = input.toInt
    val ans = D.toDouble / 100.0
    println(ans)
  } catch {
    case _: NumberFormatException =>
      System.err.println("Invalid input. Please enter an integer.")
      System.exit(1)
  }
}
