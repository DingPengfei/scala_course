def square(i: Int): Int = i * i

def sumOfSquare(x: Int, y: Int): Int = square(x) + square(y)

sumOfSquare(3, 4)

if (1 > 2) println("yes") else println("no")

def and(x: Boolean, y: => Boolean): Boolean = if (x) y else false

and(true, false)


def abs(x: Double, y: Double): Double = if ((x - y) < 0) y-x else x-y

def newton(x: Double, y: Double): Double= {
  val c = (x/y + y)/2
  if (abs(c*c,x) < 0.000000001) c else newton(x, c)
}

newton(2, 1)

def factorial(x: Int): Int = {
  def loop(n: Int, x:Int): Int = {
    if (x == 0) n else loop(x * n, x-1)
  }
  loop(1, x)
}

factorial(5)