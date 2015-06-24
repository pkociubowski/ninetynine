import org.scalatest.{FlatSpec, Matchers}
import problems.P12

/**
 * Created by patryk on 24.06.15.
 */
class P12Tests extends FlatSpec with Matchers {
  val p12 = new P12()

  it should "return correct list" in {
    p12.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) shouldBe (
      List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))

    p12.decode(List((1, 'a), (1, 'b), (1, 'c), (1, 'a), (1, 'd), (1, 'e))) shouldBe (
      List('a, 'b, 'c, 'a, 'd, 'e))

    p12.decode(List()) shouldBe (List())
  }

}

