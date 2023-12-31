package introduccion

class ListaFactoriales {
    def objListaFactoriales(n : Int): List[BigInt] = {
        var listaFactoriales : List[BigInt] = List()
        """se usa la class factorial para crear los factoriales"""
        val objFactorial : Factorial = new Factorial()
        for (i <- 0 to n){
            listaFactoriales = listaFactoriales :+ objFactorial.calculateFactorial(i)
        }
        return listaFactoriales
    }
}
