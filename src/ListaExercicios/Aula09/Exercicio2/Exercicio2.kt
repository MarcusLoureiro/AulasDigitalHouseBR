package ListaExercicios.Aula09.Exercicio2

fun main (){
    val lista1= mutableListOf<Int>()
    lista1.add(1)
    lista1.add(5)
    lista1.add(5)
    lista1.add(6)
    lista1.add(7)
    lista1.add(8)
    lista1.add(8)
    lista1.add(8)
    println("Lista: ${lista1.toString()}")
    val setLista2= mutableSetOf<Int>()
    setLista2.add(1)
    setLista2.add(5)
    setLista2.add(5)
    setLista2.add(6)
    setLista2.add(7)
    setLista2.add(8)
    setLista2.add(8)
    setLista2.add(8)
    println("Conjunto: ${setLista2.toString()}")
    println("A lista é igual ao conjunto? ${lista1==setLista2}")
}