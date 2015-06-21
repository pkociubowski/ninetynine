import org.scalatest.{FlatSpec, Matchers}
import problems.P06

/**
 * Created by patryk on 21.06.15.
 */
class P06Tests extends FlatSpec with Matchers {
  val p06 = new P06()

  it should "return true for valid palindromes" in {
    p06.isPalindrome(List()) shouldBe true
    p06.isPalindrome(List(1, 2, 3, 2, 1)) shouldBe true
    p06.isPalindrome(List(1, 1, 1, 1, 1)) shouldBe true
    p06.isPalindrome(List(9)) shouldBe true
    p06.isPalindrome(List(2, 1, 2)) shouldBe true
    p06.isPalindrome(List(7, 1, 5, 5, 1, 7)) shouldBe true
  }

  it should "return false for invalid palindromes" in {
    p06.isPalindrome(List(2, 2, 3, 2, 1)) shouldBe false
    p06.isPalindrome(List(1, 2, 1, 1, 1)) shouldBe false
    p06.isPalindrome(List(2, 1, 3)) shouldBe false
    p06.isPalindrome(List(7, 1, 6, 5, 1, 7)) shouldBe false
    p06.isPalindrome(List(1, 2)) shouldBe false
  }
}
