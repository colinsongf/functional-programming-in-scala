object Sorted {
  def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(n: Int) = {
      if (n >= as.length) true
      else if (gt(as(n), as(n+1))) false
      else go(n+1)
    }
    go(0)
  }
}
