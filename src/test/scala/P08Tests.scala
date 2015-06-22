import org.scalatest.{FlatSpec, Matchers}
import problems.P08

/**
 * Created by patryk on 22.06.15.
 */
class P08Tests extends FlatSpec with Matchers {
  val p08 = new P08()

  it should "return the list with no duplicates" in {
    p08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe List('a, 'b, 'c, 'a, 'd, 'e)
    p08.compress(List('a, 'b, 'c, 'a, 'd, 'e)) shouldBe List('a, 'b, 'c, 'a, 'd, 'e)
    p08.compress(List('a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a)) shouldBe List('a)
    p08.compress(List('z, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'z)) shouldBe List('z, 'a, 'b, 'c, 'a, 'd, 'e, 'z)
    p08.compress(List()) shouldBe List()
    p08.compress(List('a)) shouldBe List('a)
  }

}
