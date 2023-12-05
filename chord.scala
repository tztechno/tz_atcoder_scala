object Main extends App {
  println("Enter a string: ")
  val s = scala.io.StdIn.readLine().trim

  val name = List("ACE", "BDF", "CEG", "DFA", "EGB", "FAC", "GBD")

  if (name.contains(s)) {
    println("Yes")
  } else {
    println("No")
  }
}
