abc097_a.scala
#########################################
#########################################
#########################################
#########################################
import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val a, b, c, d = sc.nextInt()
  if(((b-a).abs<=d&&(c-b).abs<=d) || (c-a).abs<=d) println("Yes") else println("No")
}
#########################################
import scala.io.StdIn._
import scala.math._
object Main extends App{
  val sc = new java.util.Scanner(System.in)
  val a,b ,c,d = sc.nextInt
  if(abs(c-a)<=d || (abs(b-a)<=d && abs(c-b)<=d)){
    print("Yes")
  }
  else{
    print("No")
  }
}
#########################################
import java.util.Scanner

object Main extends App {

  val sc = new Scanner(System.in)

  val (a, b, c, d) = (sc.nextInt, sc.nextInt, sc.nextInt, sc.nextInt)

  if (math.abs(a - c) <= d) {
    println("Yes")
  } else if (math.abs(a - b) <= d && math.abs(b - c) <= d) {
    println("Yes")
  } else {
    println("No")
  }
}

#########################################
import java.util.Scanner

object Main {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()

    def abs(x: Int): Int = Math.abs(x)
    val ans = if ((abs(a - b) <= d && abs(b - c) <= d) || abs(a - c) <= d) {
      "Yes"
    } else {
      "No"
    }
    println(ans)
  }
}
#########################################
[AC on Dotty][CE on Native]

import java.util.Scanner
import scala.math.abs

object Main extends App {
  val sc = new Scanner(System.in)
  val a,b,c,d = sc.nextInt()
    
  if (abs(c - a) <= d)
    println("Yes")
  else if (abs(a - b) <= d && abs(b - c) <= d)
    println("Yes")
  else
    println("No")
}
#########################################
