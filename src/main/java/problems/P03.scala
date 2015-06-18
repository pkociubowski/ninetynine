package problems


class P03 {

  def nth(nth : Int, list : Seq[Int]): Int = list.length match {
    case length if nth <= length && length > 0 && nth > 0 => list.takeRight(length - nth + 1).head
    case _ => throw new NoSuchElementException
  }

}
