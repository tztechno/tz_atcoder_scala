abc114_a.scala
##########################################
##########################################
##########################################
##########################################
##########################################
##########################################
##########################################
object Main extends App {
  val x = scala.io.StdIn.readInt()
  if (x == 3 || x == 5 || x == 7)
    println("YES")
  else
    println("NO")
}
##########################################
object Main extends App {
  val x = scala.io.StdIn.readInt()
  if ((x-7)*(x-5)*(x-3)==0)
    println("YES")
  else
    println("NO")
}

##########################################
[python]
X=int(input())
if (X-7)*(X-5)*(X-3)==0:
  print('YES')
else:
  print('NO')
##########################################
