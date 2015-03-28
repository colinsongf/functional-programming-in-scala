def setHead[A](l: List[A], a: A): List[A] = l match {
  case Nil => sys.error("Head of empty list")
  case Cons(_, tail) => Cons(a, tail)
}