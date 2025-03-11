import java.util.Random

fun main() {
    val vetor = IntArray(7) { Random().nextInt(100) } // Números entre 0 e 99
    println("Números gerados: ${vetor.joinToString(", ")}")
}