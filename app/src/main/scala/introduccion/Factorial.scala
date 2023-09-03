package introduccion

class Factorial() {

  def calculateFactorial(n: Int): BigInt = {
    """la variable mutable factorial es un entero grande = 1, cause' factorial de 0=1"""
    var factorial : BigInt = 1
    """ciclo for que i empieza en 1 y termina en n"""
    for (i <- 1 to n) {
      factorial = factorial * i
    }
    return factorial
  }
}