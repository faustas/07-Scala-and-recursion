import scala.annotation.tailrec

object Examples {

  /**
   * Go recursively through the list of entries and summarize them.
   *
   * @param values The list of entries.
   * @return The sum of the entries of the list.
   */
  def sumRecursive(values : List[Int]) : Int = {
    values match {
      case Nil => 0
      case l: List[Int] => l.head + sumRecursive(l.tail)
    }
  }

  /**
   * Go recursively through the list and make it tailrec
   *
   * @param values The list of entries.
   * @return The sum of the entries of the list.
   */
  @tailrec
  def sumRecursiveTailrec(values : List[Int], sum: Int = 0) : Int = {
    values match {
      case Nil => sum
      case l: List[Int] => sumRecursiveTailrec(l.tail, sum + l.head)
    }
  }

  /**
   * Go recursively through the entries of the list and use an inner tailrec function.
   *
   * @param entries The list of entries.
   * @return The Integer result.
   */
  def sumRecursiveInnerTailrec(entries: List[Int]) : Int = {
    @annotation.tailrec
    def loop(pos: Int, sum: Int) : Int = {
      if (pos == entries.length) sum
      else loop(pos + 1, sum + entries(pos))
    }
    loop(0, 0)
  }

}
