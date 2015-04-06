def foldRight[A, B](ls: List[A], fallBack: B)(f: (A, B) => B): B =
  ls match {
    case Nil => fallBack
    case Cons(x, xs) => f(x, foldRight(xs, fallBack)(f))
  }
