import org.scalatest.{FlatSpec, Matchers}
import problems.P05

/**
 * Created by patryk on 21.06.15.
 */
class P05Tests extends FlatSpec with Matchers {
  val p05 = new P05()

  it should "return correct reversed list" in {
    p05.reverse(List()) should equal(List())
    p05.reverse(List(1, 2, 3)) should equal(List(3, 2, 1))
    p05.reverse(List(1, 2, 3, 7, 9)) should equal(List(9, 7, 3, 2, 1))
  }
}
