package problems

class P05 {

  // List has built in method for reversing
  def reverse(list: List[Int]): List[Int] = list match {
    case x :: rest => reverse(rest) :+ x
    case _ => Nil
  }

}
