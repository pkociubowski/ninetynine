package problems

class P08 {

  def compress(list: Seq[Symbol]): Seq[Symbol] = {
    list.foldLeft(Seq[Symbol]())(
      (accList, symbol) => accList match {
        case headList :+ lastElem => lastElem match {
          case `symbol` => accList
          case _ => accList :+ symbol
        }
        case _ => accList :+ symbol
      })
  }

}