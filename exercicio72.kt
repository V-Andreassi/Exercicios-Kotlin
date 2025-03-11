import java.util.Random

fun main() {
    val vetor = IntArray(30) { Random().nextInt(15) + 1 } // Números entre 1 e 15
    print("Digite um número (chave): ")
    val chave = readLine()!!.toInt()
    var contador = 0
    println("Posições onde a chave foi encontrada:")
    for (i in 0 until 30) {
        if (vetor[i] == chave) {
            println("Posição $i")
            contador++
        }
    }
    println("A chave $chave foi sorteada $contador vezes.")
}