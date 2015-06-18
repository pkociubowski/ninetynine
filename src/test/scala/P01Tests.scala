import problems.P01

import collection.mutable.Stack
import org.scalatest._

/**
 * Created by patryk on 16.06.15.
 */
class P01Tests extends FlatSpec with Matchers {
  val p01 = new P01()

  "P01 method" should "return correct value for multi element list" in {
    val result = p01.last(List(1,3,4,6))
    result should equal (6)
  }

  "P01 method" should "return correct value for one element list" in {
    val result = p01.last(List(3))
    result should equal (3)
  }

  it should "throw NoSuchElementException if an empty list is passed in" in {
    intercept[NoSuchElementException] {
      val ret = p01.last(List())
    }
  }
}
