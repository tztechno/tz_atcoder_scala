abc122_a.scala
##########################################
##########################################
##########################################
##########################################
##########################################
object Main extends App {
  val s = scala.io.StdIn.readLine().trim
  val mapp = Map('A' -> 'T', 'C' -> 'G', 'G' -> 'C', 'T' -> 'A')
  println(mapp(s.head))
}
##########################################
object Main extends App {
  val s = scala.io.StdIn.readLine().trim
  val mapp = Map('A' -> 'T', 'C' -> 'G', 'G' -> 'C', 'T' -> 'A')
  if (s.length == 1 && mapp.contains(s.head)) {
    println(mapp(s.head))
  } else {
    println("Invalid input. Please enter one of the characters: A, C, G, T.")
  }
}
##########################################
[error]
object Main extends App {
  val s = scala.io.StdIn.readLine().trim
  mapp={'A':'T','C':'G','G':'C','T':'A'}
  println(mapp[s])
}
##########################################
object Main extends App {
  val s = scala.io.StdIn.readLine().trim
  if (s=="A") println("T")
  else if (s=="T") println("A")
  else if (s=="C") println("G")
  else if (s=="G") println("C")
}
##########################################
[python]
b=str(input())
if b=='A':
    ans='T'
elif b=='T':
    ans='A'
elif b=='C':
    ans='G'
elif b=='G':
    ans='C'
print(ans)
##########################################
