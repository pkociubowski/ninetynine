import org.scalatest.{FlatSpec, Matchers}
import problems.P10

/**
 * Created by patryk on 24.06.15.
 */
class P10Tests extends FlatSpec with Matchers {
  val p10 = new P10()

  it should "return correct encoded list" in {
    p10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe (
      List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))

    p10.encode(List('a, 'b, 'c, 'a, 'd, 'e)) shouldBe (
      List((1, 'a), (1, 'b), (1, 'c), (1, 'a), (1, 'd), (1, 'e)))

    p10.encode(List()) shouldBe (List())
  }

}

