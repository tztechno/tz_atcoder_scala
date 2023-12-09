import scala.util.control.Breaks._

object Main extends App {

  val inputLine = scala.io.StdIn.readLine()
  val S = inputLine.toSet
  var foundUnique = false

  breakable {
    for (s <- S) {
      if (inputLine.count(_ == s) == 1) {
        println(s)
        foundUnique = true
        break
      }
    }
  }

  if (!foundUnique) {
    println("-1")
  }
}

######################################################

object Main extends App {

  val inputLine = scala.io.StdIn.readLine()
  val S = inputLine.toSet
  var foundUnique = false

  def findUnique(): Unit = {
    for (s <- S) {
      if (inputLine.count(_ == s) == 1) {
        println(s)
        foundUnique = true
        return
      }
    }
  }

  findUnique()

  if (!foundUnique) {
    println("-1")
  }
}
