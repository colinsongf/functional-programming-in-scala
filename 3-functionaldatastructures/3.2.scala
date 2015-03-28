def tail[A](l: List[A]): List[A] = l match {
  case Nil => sys.error("Tail of empty list")
  case Cons(_, xs) => xs
}
