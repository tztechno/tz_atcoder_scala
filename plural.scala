//ABC179A
//Plural
//  if (s.charAt(n - 1) == 's') {


object Main extends App {

  val s = scala.io.StdIn.readLine().trim
  val n = s.length

  if (s.charAt(n - 1) == 's') {
    println(s + "es")
  } else {
    println(s + "s")
  }
}
