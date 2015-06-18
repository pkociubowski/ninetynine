import org.scalatest._
import problems.P03

/**
 * Created by patryk on 18.06.15.
 */
class P03Tests extends FlatSpec with Matchers {
  val p03 = new P03()

  it should "return correct nth element" in {
    p03.nth(1, List(1, 3, 4, 6, 9, 1)) should equal(1)
    p03.nth(2, List(1, 3, 4, 6, 9, 1)) should equal(3)
    p03.nth(3, List(1, 3, 4, 6, 9, 1)) should equal(4)
    p03.nth(4, List(1, 3, 4, 6, 9, 1)) should equal(6)
    p03.nth(5, List(1, 3, 4, 6, 9, 1)) should equal(9)
    p03.nth(6, List(1, 3, 4, 6, 9, 1)) should equal(1)

    p03.nth(1, List(10)) should equal(10)
  }

  "asking for non existing element" should "throw NoSuchElementException" in {
    intercept[NoSuchElementException] {
      val ret = p03.nth(4, List(1,2,3))
    }
  }

  "asking for negative nth element" should "throw NoSuchElementException" in {
    intercept[NoSuchElementException] {
      val ret = p03.nth(-1, List(1,2,3))
    }
  }

  "passing an empty list" should "throw NoSuchElementException" in {
    intercept[NoSuchElementException] {
      val ret = p03.nth(1, List())
    }
  }
}
