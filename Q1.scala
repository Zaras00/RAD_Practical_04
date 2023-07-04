package Practical_4

object Q1 extends App {
  def calculateInterest(depositAmount: Double): Double = {
    depositAmount match {
      case amount if amount <= 20000 => amount * 0.02 // 2% interest for deposits up to Rs. 20,000
      case amount if amount <= 200000 => amount * 0.04 // 4% interest for deposits up to Rs. 200,000
      case amount if amount <= 2000000 => amount * 0.035 // 3.5% interest for deposits up to Rs. 2,000,000
      case _ => depositAmount * 0.065 // 6.5% interest for deposits over Rs. 2,000,000
    }
  }

  val deposit1 = 15000.0
  val interest1 = calculateInterest(deposit1)
  println(s"Interest for Rs. $deposit1 deposit: Rs. $interest1")

  val deposit2 = 100000.0
  val interest2 = calculateInterest(deposit2)
  println(s"Interest for Rs. $deposit2 deposit: Rs. $interest2")

  val deposit3 = 2500000.0
  val interest3 = calculateInterest(deposit3)
  println(s"Interest for Rs. $deposit3 deposit: Rs. $interest3")
}
