//practiceA.scala
##################################
1
2 3
test
##################################
##################################
##################################
##################################
##################################
##################################
import scala.io.StdIn.*

object Main extends App {
  val num = readInt
  val nums = readLine.split(" ").map(_.toInt).sum
  val str = readLine()
  println(s"${num + nums} $str")
}
##################################
import scala.io.StdIn

object Main extends App {
    val a = StdIn.readInt()
    val Array(b, c) = StdIn.readLine().split(" ").map(_.toInt)
    val s = StdIn.readLine()

    println(s"${a + b + c} $s")
}
##################################
// defplus @defplus さん提供
import scala.io.StdIn.*
object Main extends App {
    var a = readInt
    var num = readLine
    var s = readLine
    var sum = a + num.split(" ")(0).toInt + num.split(" ")(1).toInt
    println(sum + " " + s);
}
##################################
