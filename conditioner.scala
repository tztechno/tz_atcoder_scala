//abc174_a conditioner.scala

####################################
object Main extends App {
  val sc = new java.util.Scanner(System.in)
  println {
    if (sc.nextInt >= 30) "Yes" else "No"
  }
}
####################################
object Main extends App {

    val A = scala.io.StdIn.readLine().trim
    val X = A.toInt
    if (X>=30)
        println("Yes")
    else
        println("No")
}
####################################
object Main extends App {
    val A = scala.io.StdIn.readLine().trim
    val X = A.toInt
    val judge = X >= 30
    val ANS = Array("No", "Yes")
    println(ANS(if (judge) 1 else 0))
}
####################################
