package problems

class P09 {

  //  def pack(list: Seq[Symbol]): Seq[Seq[Symbol]] = {
  //    list.foldLeft(Seq[Seq[Symbol]]())(
  //      (accLists, symbol) => accLists match {
  //        case headLists :+ lastList =>
  //          if (lastList.contains(symbol))
  //            headLists :+ (lastList :+ symbol)
  //          else
  //            accLists :+ Seq(symbol)
  //        case _ => accLists :+ Seq(symbol)
  //      })
  //  }

  def pack(list: Seq[Symbol]): Seq[Seq[Symbol]] = {
    list.foldLeft(Seq[Seq[Symbol]]())(
      (accLists, symbol) =>
        if (!accLists.isEmpty && accLists.takeRight(1).head.contains(symbol))
          accLists.dropRight(1) :+ (accLists.takeRight(1).head :+ symbol)
        else
          accLists :+ Seq(symbol)
    )
  }
}