package week2

/**
  * Created by Ding on 7/20/2018.
  */
object exercise {
  def product(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1
    else f(a) * product(f)(a+1, b)
  }
  product(x => x * x)(1, 5)
}
