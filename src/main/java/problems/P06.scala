package problems

class P06 {

  //   def isPalindrome(list : Seq[Int]) : Boolean = list == list.reverse
  
  def isPalindrome(list: Seq[Int]): Boolean = list match {
    case head :: (list :+ last) => head == last && isPalindrome(list)
    case _ => true
  }

}
