def drop[A](ls: List[A], n: Int): List[A] = {
  if (n <= 0) ls
  else ls match {
    case Nil => Nil
    case Cons(_, xs) => drop(xs, n - 1)
  }
}
