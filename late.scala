//ABC177_A late

##################################################
import scala.io.StdIn.readLine

object Main extends App {
  val dts = readLine.split(' ').map(_.toInt)
  if (dts(0) <= dts(1) * dts(2)) println("Yes")
  else println("No")
}
##################################################
object Main extends App {
  val param = scala.io.StdIn.readLine.split(' ')
  val D = param(0).toInt
  val T = param(1).toInt
  val S = param(2).toInt
 
  val t = Math.ceil(D.toDouble / S)
 
  if (t > T) {
    println("No")
  } else {
    println("Yes")
  }
}
 
##################################################
object Answer {val from = new java.util.Scanner(System.in)
def is(x:Any) = Console.println(x)}; import Answer.from._
object Main extends App {
    val d,t,s = nextInt
    Answer is (if(d<=t*s)"Yes" else "No")
}
##################################################
