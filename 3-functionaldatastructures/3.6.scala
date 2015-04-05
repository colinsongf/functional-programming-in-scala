/*
  This function should omit the last element of a list, and
  return the rest.

  List(1, 2, 3, 4)

  -> Cons(1, init([2,3,4]))
  -> Cons(1, Cons(2, init([3, 4]))
  -> Cons(1, Cons(2, Cons(3, init([4]))))
  -> Cons(1, Cons(2, Cons(3, Nil))))
  -> [1, 2, 3]

 */
def init[A](ls: List[A]): List[A] = ls match {
  case Nil => sys.error("Empty list")
  case Cons(_, Nil) => Nil /* We don't put the headin the list. */
  case Cons(x, xs) => Cons(x, init(xs))
}
