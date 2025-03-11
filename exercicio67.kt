fun main() {
    val vetor = IntArray(16)
    vetor[0] = 1
    vetor[1] = 1
    for (i in 2 until 16) {
        vetor[i] = vetor[i - 1] + vetor[i - 2]
    }
    println(vetor.joinToString(" "))
    println("0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15")
}