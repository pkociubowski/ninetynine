package problems

class P04 {

  def length(list: Seq[Int]): Int = list match {
    case Nil => 0
    case _ => 1 + length(list.tail)
  }

}
