//abc175_a rainy.scala

############################################

object Main {
  def main(args: Array[String]): Unit = {
    val weather = scala.io.StdIn.readLine.split( "" )
    var count = 0
    var flag = false
    weather.foreach{ i =>
      if( i == "R" ) {
        if( flag ) count += 1
        else {
          count = 1
          flag = true
        }
      }
      if( i == "S" ) flag = false
    }
    println( count )
  }
}
############################################

object Answer {val from = new java.util.Scanner(System.in)
def is(x:Any) = Console.println(x)}; import Answer.from._
object Main extends App {
    val s = next.toCharArray
    Answer is (0 until s.length).map(s.segmentLength(_=='R',_)).max
}
############################################

object Main extends App {

  val A = scala.io.StdIn.readLine().trim
  var DP = List(0, 0, 0, 0)
  var ans = 0

  for (i <- 1 until 4) {
    if (A(i - 1) == 'R') {
      DP = DP.updated(i, DP(i - 1) + 1)
      if (DP(i) > ans) {
        ans = DP(i)
      }
    }
  }

  println(ans)
}
############################################
