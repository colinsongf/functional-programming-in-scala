/* returning a function that takes A as input, and returns
    a function that takes B as input and returns C */
def curry[A, B, C](f: (A, B) => C): A => B => C = {
  (a: A) => (b: B) => f(a, b)
}
