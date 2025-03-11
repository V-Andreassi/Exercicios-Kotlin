fun main() {
    val numeros = IntArray(10)
    for (i in 0 until 10) {
        print("Digite o número ${i + 1}: ")
        numeros[i] = readLine()!!.toInt()
    }
    println("Números pares e suas posições:")
    for (i in 0 until 10) {
        if (numeros[i] % 2 == 0) {
            println("Posição $i: ${numeros[i]}")
        }
    }
}