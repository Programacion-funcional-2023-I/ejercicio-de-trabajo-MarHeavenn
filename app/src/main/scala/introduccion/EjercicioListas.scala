package introduccion

import javax.naming.OperationNotSupportedException

class EjercicioListas {
  def repetirListas(lista: List[Int], n: Int): List[List[Int]] = {
    var listaRepetida : List[List[Int]] = List()
    if (n>=0){ /*n tiene que ser positivo */
      var listaInterna = List()
      for (elm <- lista){
        var listaInterna: List[Int] = List()
        for (i <- 1 to n){
          listaInterna = listaInterna :+ elm
        }
        listaRepetida = listaRepetida :+ listaInterna
      }
      return listaRepetida
    }
    else {
      throw new IllegalArgumentException( "el valor n tiene que ser positivo :(")
    }
  }

  def filtrarListas(criterioIn: String, n: Int, lista: List[Int]) : List[Int] = {
    var criterio : String = criterioIn.toLowerCase()
    var listaFiltrada : List[Int] = List()
    var funcion = (x: Int, y: Int) => x>y
    if (criterio == "menor"){
      funcion = (x: Int,y: Int )=> x<y
    }
    else {
      if (criterio == "mayoroigual"){
        funcion = (x: Int,y: Int) => x>=y
      }
      else {
        if (criterio == "menoroigual") {
          funcion = (x: Int, y: Int) => x <= y
        }
        else {
          if (criterio == "igual") {
            funcion = (x: Int, y: Int) => x == y
          }
          else {
            if (criterio == "diferente"){
              funcion = (x: Int, y: Int) => x != y
            }
            else {
              if (criterio == "mayor") {
                funcion = (x: Int, y: Int) => x > y
              }
              else{
                throw new IllegalArgumentException("el criterio es invalido")
              }
            }
          }
        }
      }
    }

    for (elm <- lista){
      if (funcion(elm,n)){
        listaFiltrada = listaFiltrada :+ elm
      }
    }
    return listaFiltrada
  }
}