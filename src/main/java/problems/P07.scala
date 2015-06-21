package problems

class P07 {

  // List has built in method for flatten structure
  def flatten(list: Seq[Any]): Seq[Any] = list.flatMap {
    case list: Seq[Any] => flatten(list)
    case elem => List(elem)
  }

}
