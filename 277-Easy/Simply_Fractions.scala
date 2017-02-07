
object solver {

  def main(args: Array[String]): Unit = {

    for(arg <- args) {
      val temp = arg.split(" ").map(_.toInt)
      val frac = new fraction(temp(0), temp(1))
      println(frac)
    }
  }
}

solver.main(Array("1 2","64 3265","25739 2768","7 18","763 4729","4 1"))

class fraction(n: Int, d: Int) {

  private val g = gcd(n, d)
  val numer = n / g
  val denom = d / g

  override def toString() = numer + " " + denom
}

def gcd(a: Int, b: Int): Int = {
  if (b == 0) a else gcd(b, a % b)
}
