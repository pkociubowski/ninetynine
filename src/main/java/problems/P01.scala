package problems


class P01 {

  def last(list: Seq[Int]): Int = list match {
    case Nil => throw new NoSuchElementException("list cannot be empty")
    case List(elem) => elem
    case _ => last(list.tail)
  }
}
