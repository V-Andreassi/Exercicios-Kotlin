fun parOuImpar(numero: Int) {
    if (numero % 2 == 0) {
        println("$numero é PAR.")
    } else {
        println("$numero é ÍMPAR.")
    }
}

fun main() {
    print("Digite um número inteiro: ")
    val numero = readLine()!!.toInt()
    parOuImpar(numero)
}