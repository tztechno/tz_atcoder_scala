abc069_b.scala
#########################################
sの使い方が特殊
println(s"${s.head}${n-2}${s.last}")
#########################################
#########################################
#########################################
#########################################
object Main extends App {
  val s = scala.io.StdIn.readLine().trim
  val n = s.length
  print(s.head)
  print(n-2)
  print(s.last)
}
#########################################
object Main extends App {
  var a = readLine
  print(a(0))
  print(a.size-2)
  print(a.last)
}
#########################################
object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in) 
    val s = sc.next
    print(s"${s.head}${s.length - 2}${s.last}")
  }
}
#########################################
object Main extends App {
  val s = scala.io.StdIn.readLine().trim
  val n = s.length
  println(s"${s.head}${n-2}${s.last}")
}
#########################################
