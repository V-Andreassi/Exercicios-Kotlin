import kotlin.random.Random

fun main() {
    print("Escolha: 1-Pedra, 2-Papel, 3-Tesoura: ")
    val jogador = readLine()!!.toInt()
    val computador = Random.nextInt(1, 4)
    println("Computador escolheu: $computador")
    when {
        jogador == computador -> println("EMPATE")
        (jogador == 1 && computador == 3) ||
                (jogador == 2 && computador == 1) ||
                (jogador == 3 && computador == 2) -> println("JOGADOR VENCEU")
        else -> println("COMPUTADOR VENCEU")
    }
}