import org.scalatest.{FlatSpec, Matchers}
import problems.P09

/**
 * Created by patryk on 23.06.15.
 */
class P09Tests extends FlatSpec with Matchers {
  val p09 = new P09()

  it should "return correct list" in {
    p09.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe (
      List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
    p09.pack(List('a, 'b, 'c, 'a, 'd, 'e)) shouldBe (
      List(List('a), List('b), List('c), List('a), List('d), List('e)))

    p09.pack(List()) shouldBe (List())
  }

}

