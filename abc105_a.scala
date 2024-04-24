abc105_a.scala
#######################################
#######################################
#######################################
#######################################
#######################################
import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val a,b = sc.nextInt()
  println(if(a%b==0)0 else 1)
}
#######################################
import scala.io.StdIn._
object Main extends App{
  val sc = new java.util.Scanner(System.in)
  val n,k = sc.nextInt
  if(n%k==0){
    print(0)
  }
  else{
    print(1)
  }
}
#######################################
import scala.io.StdIn

object Main extends App {
  val Array(n, k) = StdIn.readLine().split(" ").map(_.toInt)
  if (n % k == 0) {
    println(0)
  } else {
    println(1)
  }
}################################
