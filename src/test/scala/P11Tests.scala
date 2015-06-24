import org.scalatest.{FlatSpec, Matchers}
import problems.P11

/**
 * Created by patryk on 24.06.15.
 */
class P11Tests extends FlatSpec with Matchers {
  val p11 = new P11()

  it should "return correct encoded list" in {
    p11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe (
      List((4, 'a), 'b, (2, 'c), (2, 'a), 'd, (4, 'e)))

    p11.encodeModified(List('a, 'b, 'c, 'a, 'd, 'e)) shouldBe (
      List('a, 'b, 'c, 'a, 'd, 'e))

    p11.encodeModified(List()) shouldBe (List())
  }

}

