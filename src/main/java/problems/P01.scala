package problems


class P01 {

  def last(list: Seq[Int]): Int = {
    if (list.isEmpty)
      throw new NoSuchElementException("list cannot be empty")
    else if (list.length == 1)
      list.head
    else
      last(list.tail)
  }

}
