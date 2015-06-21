import org.scalatest._
import problems.P04

/**
 * Created by patryk on 21.06.15.
 */
class P04Tests extends FlatSpec with Matchers {
  val p04 = new P04()

  it should "return correct size of a list" in {
    p04.length(List()) should equal(0)
    p04.length(List(1, 2, 3)) should equal(3)
    p04.length(List(1, 2, 3, 7, 9)) should equal(5)

  }
}
