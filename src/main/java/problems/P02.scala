package problems


class P02 {

  def penultimate(list: Seq[Int]): Int = list match {
    case List(_) => throw new NoSuchElementException
    case _ => list.takeRight(2).head
  }

}
