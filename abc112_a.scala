abc112_a.scala
#######################################
数字入力
val n = readInt
#######################################
#######################################
#######################################
#######################################
#######################################
#######################################
object Answer {val from = new java.util.Scanner(System.in)
def is(x:Any) = Console.println(x)}; import Answer.from._
object Main extends App {
    val n = nextInt
    Answer is (if(n==1) "Hello World" else {
        val a,b = nextInt
        a+b
    })
}

#######################################
import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt()
  if(n == 1) println("Hello World") else if(2==n) println(sc.nextInt()+sc.nextInt())
}
#######################################
import scala.io.StdIn.*
object Main extends App {
  val n = readInt
  if (n == 1) {
    println(s"Hello World")
  } else {
    val a = readInt
    val b = readInt
    println(s"${a+b}")
  }
}
#######################################
[python]
N=int(input())
if N==1:
    print("Hello World")
else:
    a=int(input())
    b=int(input())
    print(a+b) 
#######################################
