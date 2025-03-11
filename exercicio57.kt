fun main() {
    var somaValores = 0
    var menorValor = Int.MAX_VALUE
    var totalValores = 0
    var valoresPares = 0
    do {
        print("Digite um número: ")
        val numero = readLine()!!.toInt()
        somaValores += numero
        if (numero < menorValor) {
            menorValor = numero
        }
        totalValores++
        if (numero % 2 == 0) {
            valoresPares++
        }
        print("Deseja continuar (S/N)? ")
        val resposta = readLine()!!
    } while (resposta.equals("S", ignoreCase = true))
    val mediaValores = if (totalValores > 0) somaValores.toDouble() / totalValores else 0.0
    println("Somatório dos valores: $somaValores")
    println("Menor valor digitado: $menorValor")
    println("Média dos valores: $mediaValores")
    println("Total de valores pares: $valoresPares")
}