import org.scalatest.{FlatSpec, Matchers}
import problems.P07

/**
 * Created by patryk on 21.06.15.
 */
class P07Tests extends FlatSpec with Matchers {
  val p07 = new P07()

  it should "return flatten list" in {
    p07.flatten(List()) shouldBe List()
    p07.flatten(List(1, 2, 3)) shouldBe List(1, 2, 3)
    p07.flatten(List(1, List(2), List(3, List(4)))) shouldBe List(1, 2, 3, 4)
    p07.flatten(List(List(List(1), 2), 3)) shouldBe List(1, 2, 3)
  }

}
