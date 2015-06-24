package problems

class P12 {

  type EncodedType = (Int, Symbol)

  def decode(list: Seq[EncodedType]): Seq[Symbol] = {
    list.flatMap {
      case (count, symbol) => for (i <- 0 until count) yield symbol
    }
  }
}