package br.com.digitalhouse.HerancaClasseAbstrata

open class Felino(open val cor: String = "") : Animal() {

    final override fun locomover() {
        for (passos in 0..2) {
            println("O felino está se locomovendo com a cor $cor")
            super.locomover()
        }
    }
}