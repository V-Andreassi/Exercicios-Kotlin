import kotlin.random.Random

fun main() {
    val numeroSorteado = Random.nextInt(1, 11)
    var tentativas = 4

    println("Tente adivinhar o número sorteado (entre 1 e 10).")

    while (tentativas > 0) {
        print("Tentativa ${5 - tentativas}: ")
        val palpite = readLine()!!.toInt()

        if (palpite == numeroSorteado) {
            println("Parabéns! Você acertou!")
            return
        } else {
            tentativas--
            if (tentativas > 0) {
                println("Você errou. Tente novamente.")
            }
        }
    }

    println("Suas tentativas acabaram. O número sorteado era $numeroSorteado.")
}