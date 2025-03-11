import kotlin.random.Random

fun main() {
    val numeroSorteado = Random.nextInt(1, 6)
    print("Tente adivinhar o número (1 a 5): ")
    val palpite = readLine()!!.toInt()
    if (palpite == numeroSorteado) {
        println("Você acertou!")
    } else {
        println("Você errou! O número era $numeroSorteado")
    }
}