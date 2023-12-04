object Main extends App {
  val S = scala.io.StdIn.readLine().trim
  val n = S.length

  val result = if (n < 4) {
    "0" * (4 - n) + S
  } else {
    S
  }

  println(result)
}
