object Fibonacci {
  def fib(n: Int): Int = {
    @annotation.tailrec
    def go(m: Int, i: Int, j: Int): Int = {
       if (m == 0) i
       else go(m-1, j, i + j)
    }
    go(n, 0, 1) 
  }
}
