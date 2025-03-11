fun main() {
    val numeros = IntArray(15)
    for (i in 0 until 15) {
        print("Digite o número ${i + 1}: ")
        numeros[i] = readLine()!!.toInt()
    }
    println("Vetor completo: ${numeros.joinToString(", ")}")
    println("Posições dos múltiplos de 10:")
    for (i in 0 until 15) {
        if (numeros[i] % 10 == 0) {
            println("Posição $i: ${numeros[i]}")
        }
    }
}