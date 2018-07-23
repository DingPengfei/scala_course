//def sum(f: Int => Int, a: Int, b: Int) : Int = {
//  if (a > b) 0 else f(a) + sum(f, a+1, b)
//}

def cube(a: Int) = a * a * a

//def fact(a: Int): Int = if (a == 0) 1 else a * fact(a-1)

sum(x => x * x * x)(1, 5)

def sum(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a+1, acc + f(a))
  }
  loop(a, 0)
}


def mapReduce(f: (Int) => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
  if (a > b) zero
  else combine(f(a), mapReduce(f, combine, zero)(a+1, b))
}

def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)

product(x => x * x)(3, 4)

def fact(n: Int) = product(x => x)(1, n)

fact(5)