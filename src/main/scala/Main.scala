object Main {

  def main(args: Array[String]): Unit = {

    val entries = List(1,2,3,4,5,6,7,8,9)

    val one   = Examples.sumRecursive(entries)
    val two   = Examples.sumRecursiveTailrec(entries)
    val three = Examples.sumRecursiveInnerTailrec(entries)

    println(one)    // 45
    println(two)    // 45
    println(three)  // 45

  }

}
