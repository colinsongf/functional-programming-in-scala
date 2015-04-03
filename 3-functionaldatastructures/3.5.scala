/*
  The first case is OK. Apparently it's a pattern guard. Oh well.
  The second case just returns the list whenever the pattern
  doesn't match.
 */
def dropWhile[A](l: List[A], f: A => Boolean): List[A] =
  l match {
    case Cons(x, xs) if f(x) => dropWhile(xs, f)
    case _ => l
  }