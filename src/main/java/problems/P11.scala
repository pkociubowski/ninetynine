package problems

class P11 {

  def encodeModified(list: Seq[Symbol]): Seq[Any] = {
    list.foldLeft(Seq[Any]())(
      (accLists, symbol) => accLists match {

        case headList :+ lastElem => lastElem match {
          case `symbol` => headList :+(2, symbol)
          case (count: Int, `symbol`) => headList :+(count + 1, symbol)
          case _ => accLists :+ symbol
        }

        case _ => accLists :+ symbol
      }

    )
  }
}