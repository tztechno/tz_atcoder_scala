abc072_b.scala
######################################
######################################
######################################
######################################
######################################
######################################
######################################
var    s:ansistring; i:longint; 
begin
   readln(s);
   for i:=1 to  length(s) do
        if odd(i) then write(s[i]);
       writeln;
end.
######################################
import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val s = sc.next.zipWithIndex

  println(
    s.filter(_._2%2==0).map(_._1).mkString
  )
}
######################################
object Main extends App {
  val S = scala.io.StdIn.readLine().trim()
  val S_list = S.toArray
  val n = S_list.length
  val ANS = (for (i <- 0 until n by 2) yield S_list(i)).mkString("")
  println(ANS)
}
######################################
