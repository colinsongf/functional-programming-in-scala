/*  f is a function from A that returns a function from B to C.
    We want to return a function from A, B to C. */
def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
  (a: A, b: B) => f(a)(b) /* f(a) is a function from B to C */
}
