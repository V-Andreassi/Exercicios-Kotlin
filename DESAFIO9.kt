import java.util.Random

fun main() {
    val vetor = IntArray(20) { Random().nextInt(100) } // Números entre 0 e 99
    println("Números gerados: ${vetor.joinToString(", ")}")
    vetor.sort()
    println("Números ordenados: ${vetor.joinToString(", ")}")
}