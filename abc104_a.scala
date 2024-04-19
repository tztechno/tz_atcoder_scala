abc104_a.scala
#######################################
#######################################
#######################################
#######################################
#######################################
object Main extends App {
  val in = new java.util.Scanner(System.in)
  val R = in.nextInt
  println(
    if (R < 1200) "ABC"
    else if (R < 2800) "ARC"
    else "AGC"
  )
}
#######################################
object Main extends App {
  val r = io.StdIn.readShort()

  println(if (r < 1200) "ABC" else if (r < 2800) "ARC" else "AGC")
}
#######################################
[My AC]

object Main extends App {
  import scala.io.StdIn._
  val num = readLine.toInt
  val result = if (num <1200 ) "ABC" else if (num <2800 ) "ARC" else "AGC"
  println(result)
}
#######################################
