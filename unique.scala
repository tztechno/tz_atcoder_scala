object Main extends App {

  val inputLine = scala.io.StdIn.readLine()
  val S = inputLine.toSet

  var foundUnique = false
  for (s <- S) {
    if (inputLine.count(_ == s) == 1) {
      println(s)
      foundUnique = true
    }
  }

  if (!foundUnique) {
    println("-1")
  }
}
