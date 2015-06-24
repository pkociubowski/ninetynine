package problems

class P10 {

  type EncodedType = (Int, Symbol)

  def encode(list: Seq[Symbol]): Seq[EncodedType] = {
    list.foldLeft(Seq[EncodedType]())(
      (accLists, symbol) =>
        if (!accLists.isEmpty && accLists.takeRight(1).head._2 == symbol)
          accLists.dropRight(1) :+(accLists.takeRight(1).head._1 + 1, symbol)
        else
          accLists :+(1, symbol)
    )
  }
}