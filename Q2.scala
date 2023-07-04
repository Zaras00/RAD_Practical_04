package Practical_4
import scala.io.StdIn

object Q2 extends  App {

  print("Enter an integer : ")
  val input = StdIn.readInt()
  val message = input match {
    case n if n <= 0 => "Negative/Zero is given" // Input is less than or equal to 0
    case n if n % 2 == 0 => "Even number is given" // Input is even
    case _ => "Odd number is given" // Input is odd
  }

  println(message)
}



