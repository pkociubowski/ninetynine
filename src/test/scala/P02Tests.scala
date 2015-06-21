import org.scalatest._
import problems.P02

/**
 * Created by patryk on 18.06.15.
 */
class P02Tests extends FlatSpec with Matchers {
  val p02 = new P02()

  "passing multi element list" should "return correct last but one element" in {
    p02.penultimate(List(1, 3, 4, 6, 9, 1)) should equal(9)
    p02.penultimate(List(1, 3, 4, 6)) should equal(4)
    p02.penultimate(List(1, 3)) should equal(1)
  }

  "passing one element list" should "throw NoSuchElementException" in {
    intercept[NoSuchElementException] {
      val result = p02.penultimate(List(3))
    }
  }

  "passing empty list" should "throw NoSuchElementException" in {
    intercept[NoSuchElementException] {
      val ret = p02.penultimate(List())
    }
  }
}
